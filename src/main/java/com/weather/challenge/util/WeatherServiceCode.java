package com.weather.challenge.util;

public enum WeatherServiceCode {

	OK(0, "OK"), 
	JSON_INVALIDO(1, "Error creating Json response"), 
	SERVER_ERROR(2, "Unable to process the request"), 
	EXISTING_USER(3, "The user already exists"), 
	UNEXISTING_USER(4, "The user does not exist");

	private final int result;
	private final String description;

	private WeatherServiceCode(int result, String description) {
		this.result = result;
		this.description = description;
	}

	public int getResult() {
		return result;
	}

	public String getDescription() {
		return description;
	}

}
