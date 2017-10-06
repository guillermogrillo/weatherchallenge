package com.weather.challenge.dto;

import com.weather.challenge.dto.external.WeatherDto;

public class LocationDto {

	private String city;
	private String country;
	private String woeid;
	private WeatherDto weather;

	public LocationDto() {
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWoeid() {
		return woeid;
	}

	public void setWoeid(String woeid) {
		this.woeid = woeid;
	}

	public WeatherDto getWeather() {
		return weather;
	}

	public void setWeather(WeatherDto weather) {
		this.weather = weather;
	}

}
