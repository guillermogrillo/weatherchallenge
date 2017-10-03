package com.weather.challenge.dto.external;

public class Forecast {

    private String date;
    private Integer low;
    private Integer high;
    private String text;

    public Forecast(String date, Integer low, Integer high, String text) {
        this.date = date;
        this.low = low;
        this.high = high;
        this.text = text;
    }

    public Forecast() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
