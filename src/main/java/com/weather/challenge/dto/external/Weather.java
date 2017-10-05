package com.weather.challenge.dto.external;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Weather {

	private String city;
	private String country;
	private String woeid;
	private Condition condition;
	private List<Forecast> forecasts;
	

	public Weather(String city, String country, String woeid, Condition condition, List<Forecast> forecasts) {
		this.city = city;
		this.country = country;
		this.woeid = woeid;
		this.condition = condition;
		this.forecasts = forecasts;
	}

	public Weather() {
		this.forecasts = new ArrayList<>();
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

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public List<Forecast> getForecasts() {
		return forecasts;
	}

	public void setForecasts(List<Forecast> forecasts) {
		this.forecasts = forecasts;
	}
}
