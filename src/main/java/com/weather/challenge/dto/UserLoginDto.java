package com.weather.challenge.dto;

public class UserLoginDto {

	private String username;
	private String password;

	public UserLoginDto() {

	}

	public UserLoginDto(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
