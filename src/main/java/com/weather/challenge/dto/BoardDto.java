package com.weather.challenge.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.weather.challenge.dto.external.Weather;

public class BoardDto {
	
	private String id;
    private String description;
    private List<LocationDto> locations;
    private String lastUpdate;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    
    public BoardDto(String id, String description, List<Weather> weathers) {
		super();
		this.setId(id);
		this.description = description;
		this.locations = new ArrayList<>();
		this.lastUpdate = LocalDateTime.now().format(formatter);
	}

	public BoardDto() {
		this.locations = new ArrayList<>();
		this.lastUpdate = LocalDateTime.now().format(formatter);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<LocationDto> getLocations() {
		return locations;
	}

	public void setLocations(List<LocationDto> locations) {
		this.locations = locations;
	}

}
