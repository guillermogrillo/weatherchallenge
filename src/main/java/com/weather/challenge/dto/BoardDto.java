package com.weather.challenge.dto;

import java.util.ArrayList;
import java.util.List;

import com.weather.challenge.dto.external.Weather;

public class BoardDto {

    private String description;
    private List<Weather> weathers;
    
    public BoardDto(String description, List<Weather> weathers) {
		super();
		this.description = description;
		this.weathers = new ArrayList<>();
	}

	public BoardDto() {
		this.weathers = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public List<Weather> getWeathers() {
		return weathers;
	}

	public void setWeathers(List<Weather> weathers) {
		this.weathers = weathers;
	}

}
