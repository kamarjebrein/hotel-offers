package com.expedia.controllers;

import com.expedia.dtos.FilterParameters;
import com.expedia.dtos.FilteringResult;
import com.expedia.usecases.HotelOffersUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OffersController {

    @Autowired
    private HotelOffersUseCase hotelOffersUseCase;

    @RequestMapping(value = "/")
    public String index() {
        return "form";
    }

    @RequestMapping(value = "/showOffers")
    public String showOffers(Model model,
                             @RequestParam(defaultValue = "foo") String userId,
                             @RequestParam() String destination,
                             @RequestParam() String minTripStartDate,
                             @RequestParam() String maxTripStartDate,
                             @RequestParam() String lengthOfStay,
                             @RequestParam() String minStarRating,
                             @RequestParam() String maxStarRating,
                             @RequestParam() String minTotalRate,
                             @RequestParam() String maxTotalRate,
                             @RequestParam() String minGuestRating,
                             @RequestParam() String maxGuestRating,
                             @RequestParam() String maxPrice) {
        FilterParameters.Builder builder = new FilterParameters.Builder();
        builder.setUserId(userId);
        builder.setDestination(destination);
        builder.setMinStartDate(minTripStartDate);
        builder.setMaxStartDate(maxTripStartDate);
        builder.setLengthOfStay(lengthOfStay);
        builder.setMinStarRate(minStarRating);
        builder.setMaxStarRate(maxStarRating);
        builder.setMinTotalRate(minTotalRate);
        builder.setMaxTotalRate(maxTotalRate);
        builder.setMinGuestRate(minGuestRating);
        builder.setMaxGuestRate(maxGuestRating);
        builder.setMaxPrice(maxPrice);
        FilterParameters parameters = builder.build();
        FilteringResult result = hotelOffersUseCase.filterOffersAgainst(parameters);
        model.addAttribute("hotelOffers", result.getOffers());
        return "offers";

    }
}
