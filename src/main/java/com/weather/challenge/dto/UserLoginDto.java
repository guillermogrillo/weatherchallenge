package com.weather.challenge.dto;

public class UserLoginDto extends UserDto {

	private String password;

	public UserLoginDto() {

	}

	public UserLoginDto(String username, String password) {
		super(username);
		this.setPassword(password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
