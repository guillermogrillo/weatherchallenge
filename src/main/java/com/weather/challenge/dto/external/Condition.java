package com.weather.challenge.dto.external;

public class Condition {

    private String description;
    private int temp;
    private String date;

    public Condition(String description, int temp, String date) {
        this.description = description;
        this.temp = temp;
        this.date = date;
    }

    public Condition(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
