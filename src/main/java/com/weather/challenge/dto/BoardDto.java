package com.weather.challenge.dto;

import java.util.ArrayList;
import java.util.List;

import com.weather.challenge.dto.external.WeatherDto;

public class BoardDto {
	
	private String id;
    private String description;
    private List<LocationDto> locations;
    
    public BoardDto(String id, String description, List<WeatherDto> weathers) {
		super();
		this.setId(id);
		this.description = description;
		this.locations = new ArrayList<>();
	}

	public BoardDto() {
		this.locations = new ArrayList<>();
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

	public List<LocationDto> getLocations() {
		return locations;
	}

	public void setLocations(List<LocationDto> locations) {
		this.locations = locations;
	}

}
