package com.weather.challenge.dto;

public class BoardDto {

    private String description;
    private UserDto user;

    public BoardDto() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}
}
