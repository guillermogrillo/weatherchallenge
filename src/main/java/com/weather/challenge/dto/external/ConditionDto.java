package com.weather.challenge.dto.external;

public class ConditionDto {

    private String description;
    private int temp;
    private String date;
    private int code;

    public ConditionDto(String description, int temp, String date, int code) {
        this.description = description;
        this.temp = temp;
        this.date = date;
        this.code = code;
    }

    public ConditionDto(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
