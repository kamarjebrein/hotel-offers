package com.expedia.pojos;

public class OfferDateRange {

    private Integer[] travelStartDate;
    private Integer[] travelEndDate;
    private Integer lengthOfStay;

    public Integer[] getTravelStartDate() {
        return travelStartDate;
    }

    public void setTravelStartDate(Integer[] travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    public Integer[] getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(Integer[] travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }
}
