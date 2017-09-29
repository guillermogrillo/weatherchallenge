package com.weather.challenge.dto.external;

import java.util.List;

public class Weather {

    private String description;
    private Wind wind;
    private Atmosphere atmosphere;
    private Condition condition;
    private List<Forecast> forecasts;

    public Weather(String description, Wind wind, Atmosphere atmosphere, Condition condition, List<Forecast> forecasts) {
        this.description = description;
        this.wind = wind;
        this.atmosphere = atmosphere;
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

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
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
