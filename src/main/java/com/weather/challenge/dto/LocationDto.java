package com.weather.challenge.dto;

import com.weather.challenge.entity.Location;

public class LocationDto {

    private String id;
    private String description;

    public LocationDto(String description) {
        this.description = description;
    }

    public LocationDto(Location location) {
        this.id = location.getId();
        this.description = location.getDescription();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
