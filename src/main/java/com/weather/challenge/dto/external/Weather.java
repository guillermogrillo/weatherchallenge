package com.weather.challenge.dto.external;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Weather {
	private Condition condition;
	private List<Forecast> forecasts;
	

	public Weather(Condition condition, List<Forecast> forecasts) {
		this.condition = condition;
		this.forecasts = forecasts;
	}

	public Weather() {
		this.forecasts = new ArrayList<>();
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
