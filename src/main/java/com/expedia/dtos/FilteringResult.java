package com.expedia.dtos;

import java.util.ArrayList;
import java.util.List;

public class FilteringResult {

    private List<HotelOffer> offers = new ArrayList<>();

    public List<HotelOffer> getOffers() {
        return offers;
    }

    public void setOffers(List<HotelOffer> offers) {
        this.offers = offers;
    }

}
