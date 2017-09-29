package com.weather.challenge.dto.external;

import java.util.Date;

public class Condition {

    private String description;
    private int temp;
    private Date date;

    public Condition(String description, int temp, Date date) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
