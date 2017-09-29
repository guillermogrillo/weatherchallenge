package com.weather.challenge.dto.external;

import java.util.Date;

public class Forecast {

    private Date date;
    private Integer low;
    private Integer high;
    private String text;

    public Forecast(Date date, Integer low, Integer high, String text) {
        this.date = date;
        this.low = low;
        this.high = high;
        this.text = text;
    }

    public Forecast() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
