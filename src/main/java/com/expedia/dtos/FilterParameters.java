package com.expedia.dtos;

public class FilterParameters {

    private String userId;
    private String destination;
    private String minStartDate;
    private String maxStartDate;
    private String lengthOfStay;
    private String minStarRateRange;
    private String maxStarRateRange;
    private String minTotalRateRange;
    private String maxTotalRateRange;
    private String minGuestRateRange;
    private String maxGuestRateRange;
    private String maxPrice;

    private FilterParameters() {
    }

    public String getUserId() {
        return userId;
    }

    public String getDestination() {
        return destination;
    }

    public String getMinStartDate() {
        return minStartDate;
    }

    public String getMaxStartDate() {
        return maxStartDate;
    }

    public String getLengthOfStay() {
        return lengthOfStay;
    }

    public String getMinStarRate() {
        return minStarRateRange;
    }

    public String getMaxStarRate() {
        return maxStarRateRange;
    }

    public String getMinTotalRate() {
        return minTotalRateRange;
    }

    public String getMaxTotalRate() {
        return maxTotalRateRange;
    }

    public String getMinGuestRate() {
        return minGuestRateRange;
    }

    public String getMaxGuestRate() {
        return maxGuestRateRange;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public static class Builder {
        private FilterParameters parameters;

        public Builder() {
            this.parameters = new FilterParameters();
        }

        public void setUserId(String userId) {
            parameters.userId = userId;
        }

        public void setDestination(String destination) {
            parameters.destination = destination;
        }

        public void setMinStartDate(String minStartDate) {
            parameters.minStartDate = minStartDate;
        }

        public void setMaxStartDate(String maxStartDate) {
            parameters.maxStartDate = maxStartDate;
        }

        public void setLengthOfStay(String lengthOfStay) {
            parameters.lengthOfStay = lengthOfStay;
        }

        public void setMinStarRate(String minStarRateRange) {
            parameters.minStarRateRange = minStarRateRange;
        }

        public void setMaxStarRate(String maxStarRateRange) {
            parameters.maxStarRateRange = maxStarRateRange;
        }

        public void setMinTotalRate(String minTotalRateRange) {
            parameters.minTotalRateRange = minTotalRateRange;
        }

        public void setMaxTotalRate(String maxTotalRateRange) {
            parameters.maxTotalRateRange = maxTotalRateRange;
        }

        public void setMinGuestRate(String minGuestRateRange) {
            parameters.minGuestRateRange = minGuestRateRange;
        }

        public void setMaxGuestRate(String maxGuestRateRange) {
            parameters.maxGuestRateRange = maxGuestRateRange;
        }

        public void setMaxPrice(String maxPrice) {
            parameters.maxPrice = maxPrice;
        }

        public FilterParameters build() {
            return this.parameters;
        }
    }

}
