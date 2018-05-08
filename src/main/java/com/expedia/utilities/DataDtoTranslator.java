package com.expedia.utilities;

import com.expedia.dtos.HotelOffer;
import com.expedia.pojos.Hotel;

import java.io.UnsupportedEncodingException;

public class DataDtoTranslator {

    public static HotelOffer dataToDTO(Hotel hotel) {
        HotelOffer.Builder builder = new HotelOffer.Builder();
        builder.setImageUrl(hotel.getHotelInfo().getHotelImageUrl());
        builder.setName(hotel.getHotelInfo().getHotelName());
        builder.setCityName(hotel.getDestination().getShortName());
        builder.setStarRating(hotel.getHotelInfo().getHotelStarRating());
        builder.setGuestReviewRating(hotel.getHotelInfo().getHotelGuestReviewRating().toString());
        builder.setHasVipAccess(hotel.getHotelInfo().getVipAccess());
        builder.setSavingPercentage(hotel.getHotelPricingInfo().getPercentSavings().toString());
        builder.setOriginalPricePerNight(hotel.getHotelPricingInfo().getOriginalPricePerNight().toString());
        builder.setOfferedPricePerNight(hotel.getHotelPricingInfo().getAveragePriceValue().toString());
        builder.setInfoSiteUrl(decodeURL(hotel.getHotelUrls().getHotelInfositeUrl()));
        builder.setSearchResultUrl(decodeURL(hotel.getHotelUrls().getHotelSearchResultUrl()));
        return builder.build();
    }

    private static String decodeURL(String encodedURL) {
        try {
            return java.net.URLDecoder.decode(encodedURL, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encodedURL;
    }

}
