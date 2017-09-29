package com.weather.challenge.dto;

import java.util.List;

import com.weather.challenge.dto.external.Place;

public class NewBoardDto {

	private String description;
	private List<Place> places;

	public NewBoardDto(String description, List<Place> places) {
		super();
		this.description = description;
		this.places = places;
	}

	public NewBoardDto() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Place> getPlaces() {
		return places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}

}
