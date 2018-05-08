package com.expedia.dtos;

public class HotelOffer {
    private String hotelName;
    private String cityName;
    private String imageUrl;
    private String starRating;
    private String guestReviewRating;
    private Boolean hasVipAccess;
    private String savingPercentage;
    private String originalPricePerNight;
    private String offeredPricePerNight;
    private String infoSiteUrl;
    private String searchResultUrl;

    private HotelOffer() {
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getStarRating() {
        return starRating;
    }

    public String getGuestReviewRating() {
        return guestReviewRating;
    }

    public Boolean getHasVipAccess() {
        return hasVipAccess;
    }

    public String getSavingPercentage() {
        return savingPercentage;
    }

    public String getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public String getOfferedPricePerNight() {
        return offeredPricePerNight;
    }

    public String getInfoSiteUrl() {
        return infoSiteUrl;
    }

    public String getSearchResultUrl() {
        return searchResultUrl;
    }


    public static class Builder {
        private HotelOffer hotelOffer;

        public Builder() {
            this.hotelOffer = new HotelOffer();
        }

        public void setName(String hotelName) {
            hotelOffer.hotelName = hotelName;
        }

        public void setCityName(String cityName) {
            hotelOffer.cityName = cityName;
        }

        public void setImageUrl(String imageUrl) {
            hotelOffer.imageUrl = imageUrl;
        }

        public void setStarRating(String starRating) {
            hotelOffer.starRating = starRating;
        }

        public void setGuestReviewRating(String guestReviewRating) {
            hotelOffer.guestReviewRating = guestReviewRating;
        }

        public void setHasVipAccess(Boolean hasVipAccess) {
            hotelOffer.hasVipAccess = hasVipAccess;
        }

        public void setSavingPercentage(String savingPercentage) {
            hotelOffer.savingPercentage = savingPercentage;
        }

        public void setOriginalPricePerNight(String originalPricePerNight) {
            hotelOffer.originalPricePerNight = originalPricePerNight;
        }

        public void setOfferedPricePerNight(String offeredPricePerNight) {
            hotelOffer.offeredPricePerNight = offeredPricePerNight;
        }

        public void setInfoSiteUrl(String infoSiteUrl) {
            hotelOffer.infoSiteUrl = infoSiteUrl;
        }

        public void setSearchResultUrl(String searchResultUrl) {
            hotelOffer.searchResultUrl = searchResultUrl;
        }

        public HotelOffer build() {
            return this.hotelOffer;
        }
    }

}
