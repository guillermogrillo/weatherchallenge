package com.weather.challenge.dto.external;

public class ForecastDto {

	private String date;
	private Integer low;
	private Integer high;
	private String description;
	private int code;

	public ForecastDto(String date, Integer low, Integer high, String description, int code) {
		this.date = date;
		this.low = low;
		this.high = high;
		this.description = description;
		this.code = code;
	}

	public ForecastDto() {
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getLow() {
		return low;
	}

	public void setLow(Integer low) {
		this.low = low;
	}

	public Integer getHigh() {
		return high;
	}

	public void setHigh(Integer high) {
		this.high = high;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
