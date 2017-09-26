package com.weather.challenge.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Board {

    @Id
    private String id;

    private String description;

    List<Location> locations;

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

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
