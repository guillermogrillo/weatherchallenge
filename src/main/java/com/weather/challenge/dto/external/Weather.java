package com.weather.challenge.dto.external;

import java.util.List;

public class Weather {

    private String description;
    private Condition condition;
    private List<Forecast> forecasts;

    public Weather(String description, Condition condition, List<Forecast> forecasts) {
        this.description = description;
        this.condition = condition;
        this.forecasts = forecasts;
    }

    public Weather() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }
}
