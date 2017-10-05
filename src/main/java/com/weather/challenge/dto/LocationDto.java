package com.weather.challenge.dto;

import java.util.ArrayList;
import java.util.List;

import com.weather.challenge.dto.external.Weather;

public class LocationDto {

	private String city;
	private String country;
	private String woeid;
	private Weather weather;

	public LocationDto(String city, String country, String woeid, Weather weather) {
		super();
		this.city = city;
		this.country = country;
		this.woeid = woeid;
		this.weather = weather;
	}

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

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	
}
