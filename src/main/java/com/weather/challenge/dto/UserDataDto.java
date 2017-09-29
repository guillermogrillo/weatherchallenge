package com.weather.challenge.dto;

import java.util.List;

public class UserDataDto {

	private UserDto userDto;
	private List<BoardDto> boards;

	public UserDataDto(UserDto userDto, List<BoardDto> boards) {
		super();
		this.userDto = userDto;
		this.boards = boards;
	}

	public UserDataDto() {
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	public List<BoardDto> getBoards() {
		return boards;
	}

	public void setBoards(List<BoardDto> boards) {
		this.boards = boards;
	}

}
