package com.weather.challenge.dto.external;

public class Wind {

    private Integer chill;
    private Integer direction;
    private Float speed;

    public Wind(Integer chill, Integer direction, Float speed) {
        this.chill = chill;
        this.direction = direction;
        this.speed = speed;
    }

    public Wind() {
    }

    public Integer getChill() {
        return chill;
    }

    public void setChill(Integer chill) {
        this.chill = chill;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }
}
