package com.expedia.pojos;

import java.math.BigDecimal;

public class HotelInfo {

    private String hotelId;
    private String hotelName;
    private String localizedHotelName;
    private String hotelDestination;
    private String hotelDestinationRegionID;
    private String hotelLongDestination;
    private String hotelStreetAddress;
    private String hotelCity;
    private String hotelProvince;
    private String hotelCountryCode;
    private BigDecimal hotelLatitude;
    private BigDecimal hotelLongitude;
    private String hotelStarRating;
    private BigDecimal hotelGuestReviewRating;
    private Integer hotelReviewTotal;
    private String hotelImageUrl;
    private Boolean vipAccess;
    private Boolean isOfficialRating;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocalizedHotelName() {
        return localizedHotelName;
    }

    public void setLocalizedHotelName(String localizedHotelName) {
        this.localizedHotelName = localizedHotelName;
    }

    public String getHotelDestination() {
        return hotelDestination;
    }

    public void setHotelDestination(String hotelDestination) {
        this.hotelDestination = hotelDestination;
    }

    public String getHotelDestinationRegionID() {
        return hotelDestinationRegionID;
    }

    public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
        this.hotelDestinationRegionID = hotelDestinationRegionID;
    }

    public String getHotelLongDestination() {
        return hotelLongDestination;
    }

    public void setHotelLongDestination(String hotelLongDestination) {
        this.hotelLongDestination = hotelLongDestination;
    }

    public String getHotelStreetAddress() {
        return hotelStreetAddress;
    }

    public void setHotelStreetAddress(String hotelStreetAddress) {
        this.hotelStreetAddress = hotelStreetAddress;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelProvince() {
        return hotelProvince;
    }

    public void setHotelProvince(String hotelProvince) {
        this.hotelProvince = hotelProvince;
    }

    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    public void setHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
    }

    public BigDecimal getHotelLatitude() {
        return hotelLatitude;
    }

    public void setHotelLatitude(BigDecimal hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    public BigDecimal getHotelLongitude() {
        return hotelLongitude;
    }

    public void setHotelLongitude(BigDecimal hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    public String getHotelStarRating() {
        return hotelStarRating;
    }

    public void setHotelStarRating(String hotelStarRating) {
        this.hotelStarRating = hotelStarRating;
    }

    public BigDecimal getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    public void setHotelGuestReviewRating(BigDecimal hotelGuestReviewRating) {
        this.hotelGuestReviewRating = hotelGuestReviewRating;
    }

    public Integer getHotelReviewTotal() {
        return hotelReviewTotal;
    }

    public void setHotelReviewTotal(Integer hotelReviewTotal) {
        this.hotelReviewTotal = hotelReviewTotal;
    }

    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    public void setHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
    }

    public Boolean getVipAccess() {
        return vipAccess;
    }

    public void setVipAccess(Boolean vipAccess) {
        this.vipAccess = vipAccess;
    }

    public Boolean getOfficialRating() {
        return isOfficialRating;
    }

    public void setOfficialRating(Boolean officialRating) {
        isOfficialRating = officialRating;
    }
}
