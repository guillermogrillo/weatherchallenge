package com.weather.challenge.dto.external;

public class Atmosphere {

    private Integer humidity;
    private Float visibility;
    private Float pressure;
    private PressureState rising;

    public enum PressureState {STEADY, RISING, FALLING;}

    public Atmosphere(Integer humidity, Float visibility, Float pressure, PressureState rising) {
        this.humidity = humidity;
        this.visibility = visibility;
        this.pressure = pressure;
        this.rising = rising;
    }

    public Atmosphere() {
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Float getVisibility() {
        return visibility;
    }

    public void setVisibility(Float visibility) {
        this.visibility = visibility;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public PressureState getRising() {
        return rising;
    }

    public void setRising(PressureState rising) {
        this.rising = rising;
    }
}
