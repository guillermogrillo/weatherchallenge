package com.weather.challenge.dto;

import java.util.ArrayList;
import java.util.List;

public class NewBoardDto {

	private String description;
	private List<String> woeids;

	public NewBoardDto(String description, List<String> woeids) {
		super();
		this.description = description;
		this.woeids = new ArrayList<>();
	}

	public NewBoardDto() {
		this.woeids = new ArrayList<>();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getWoeids() {
		return woeids;
	}

	public void setWoeids(List<String> woeids) {
		this.woeids = woeids;
	}

}
