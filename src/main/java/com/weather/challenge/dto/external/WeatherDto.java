package com.weather.challenge.dto.external;

import java.util.ArrayList;
import java.util.List;

public class WeatherDto {

	private String description;
	private Integer temperature;
	private String date;
	private Integer code;
	private String lastUpdateDateTime;
	private List<ForecastDto> forecasts;

	public WeatherDto() {
		this.forecasts = new ArrayList<>();
	}

	public List<ForecastDto> getForecasts() {
		return forecasts;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setForecasts(List<ForecastDto> forecasts) {
		this.forecasts = forecasts;
	}

	public String getLastUpdateDateTime() {
		return lastUpdateDateTime;
	}

	public void setLastUpdateDateTime(String lastUpdateDateTime) {
		this.lastUpdateDateTime = lastUpdateDateTime;
	}
}
