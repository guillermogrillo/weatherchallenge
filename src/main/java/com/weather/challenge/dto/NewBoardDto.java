package com.weather.challenge.dto;

import java.util.List;

public class NewBoardDto {

	private String description;
	private List<String> woeids;

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
