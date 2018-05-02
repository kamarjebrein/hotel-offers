package com.expedia.pojos;

import java.math.BigDecimal;

public class HotelPricingInfo {

    private BigDecimal averagePriceValue;
    private BigDecimal totalPriceValue;
    private BigDecimal crossOutPriceValue;
    private BigDecimal originalPricePerNight;
    private String currency;
    private BigDecimal percentSavings;
    private Boolean drr;

    public BigDecimal getAveragePriceValue() {
        return averagePriceValue;
    }

    public void setAveragePriceValue(BigDecimal averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    public BigDecimal getTotalPriceValue() {
        return totalPriceValue;
    }

    public void setTotalPriceValue(BigDecimal totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    public BigDecimal getCrossOutPriceValue() {
        return crossOutPriceValue;
    }

    public void setCrossOutPriceValue(BigDecimal crossOutPriceValue) {
        this.crossOutPriceValue = crossOutPriceValue;
    }

    public BigDecimal getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public void setOriginalPricePerNight(BigDecimal originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPercentSavings() {
        return percentSavings;
    }

    public void setPercentSavings(BigDecimal percentSavings) {
        this.percentSavings = percentSavings;
    }

    public Boolean getDrr() {
        return drr;
    }

    public void setDrr(Boolean drr) {
        this.drr = drr;
    }
}
