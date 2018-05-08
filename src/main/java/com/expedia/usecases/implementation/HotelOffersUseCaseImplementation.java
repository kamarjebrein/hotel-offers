package com.expedia.usecases.implementation;

import com.expedia.dtos.FilterParameters;
import com.expedia.dtos.FilteringResult;
import com.expedia.dtos.HotelOffer;
import com.expedia.gateway.DealsGateway;
import com.expedia.pojos.Deal;
import com.expedia.pojos.Destination;
import com.expedia.pojos.Hotel;
import com.expedia.usecases.HotelOffersUseCase;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.expedia.utilities.DataDtoTranslator.dataToDTO;
import static com.expedia.utilities.Utils.*;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

@Component
public class HotelOffersUseCaseImplementation implements HotelOffersUseCase {

    @Autowired
    private DealsGateway dealsGateway;

    @Override
    public FilteringResult filterOffersAgainst(FilterParameters parameters) {
        String allDeals = dealsGateway.getAllDeals(parameters.getUserId());
        Deal deal = new Gson().fromJson(allDeals, Deal.class);
        List<Hotel> hotels = deal.getOffers().getHotel()
                .stream()
                .filter(h -> hasRequestedDestination(parameters.getDestination(), h.getDestination()))
                .filter(h -> isStartDateInRange(parameters.getMinStartDate(), parameters.getMaxStartDate(), h.getOfferDateRange().getTravelStartDate()))
                .filter(h -> sameStayLength(parameters.getLengthOfStay(), h.getOfferDateRange().getLengthOfStay()))
                .filter(h -> isRatingInRange(parameters.getMinStarRate(), parameters.getMaxStarRate(), h.getHotelInfo().getHotelStarRating()))
                .filter(h -> isRatingInRange(parameters.getMinGuestRate(), parameters.getMaxGuestRate(), h.getHotelInfo().getHotelGuestReviewRating().toString()))
                .filter(h -> isRatingInRange(parameters.getMinTotalRate(), parameters.getMaxTotalRate(), h.getHotelInfo().getOfficialRating().toString()))
                .filter(h -> isPriceInBudget(parameters.getMaxPrice(), h.getHotelPricingInfo().getAveragePriceValue()))
                .collect(Collectors.toList());
        return fillFilteringResult(hotels);
    }

    private boolean hasRequestedDestination(String requestedDestination, Destination destination) {
        return !isNotBlank(requestedDestination) || (requestedDestination.equalsIgnoreCase(destination.getShortName()) || requestedDestination.equalsIgnoreCase(destination.getRegionID()) || requestedDestination.equalsIgnoreCase(destination.getCity()));
    }

    private boolean isStartDateInRange(String minStartDate, String maxStartDate, Integer[] travelStartDate) {
        if (isNotBlank(minStartDate) && isNotBlank(maxStartDate)) {
            LocalDate date = LocalDate.of(travelStartDate[0], travelStartDate[1], travelStartDate[2]);
            LocalDate minDate = LocalDate.parse(minStartDate);
            LocalDate maxDate = LocalDate.parse(maxStartDate);
            return date.isEqual(minDate)
                    || date.isEqual(maxDate)
                    || (date.isAfter(minDate) && date.isBefore(maxDate));
        } else
            return true;
    }

    private boolean sameStayLength(String requestedLengthOfStay, Integer lengthOfStay) {
        return !isNotBlank(requestedLengthOfStay) || requestedLengthOfStay.equalsIgnoreCase(lengthOfStay.toString());
    }

    private boolean isRatingInRange(String minRate, String maxRate, String hotelRating) {
        if (isNotBlank(minRate) && isNotBlank(maxRate)) {
            BigDecimal minimumRate = new BigDecimal(minRate);
            BigDecimal maximumRate = new BigDecimal(maxRate);
            BigDecimal rate = new BigDecimal(hotelRating);
            return areEqual(rate, minimumRate)
                    || areEqual(rate, maximumRate)
                    || (firstGreaterThanSecond(minimumRate, rate) && firstLessThanSecond(rate, maximumRate));
        } else
            return true;
    }

    private boolean isPriceInBudget(String maxPrice, BigDecimal averagePriceValue) {
        if (isNotBlank(maxPrice)) {
            BigDecimal maximumPrice = new BigDecimal(maxPrice);
            return firstLessThanSecond(averagePriceValue, maximumPrice)
                    || areEqual(averagePriceValue, maximumPrice);
        }
        return true;
    }

    private FilteringResult fillFilteringResult(List<Hotel> hotels) {
        List<HotelOffer> offers = new ArrayList<>();
        hotels.forEach(hotel -> offers.add(dataToDTO(hotel)));
        FilteringResult result = new FilteringResult();
        result.setOffers(offers);
        return result;
    }

}
