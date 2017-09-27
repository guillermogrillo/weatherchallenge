package com.weather.challenge.mapper;

import org.springframework.stereotype.Component;

import com.weather.challenge.dto.UserDto;
import com.weather.challenge.entity.User;

/**
 * Componente que mapea User-UserDto y viceversa
 *
 */

@Component
public class UserMapper implements Mapeable<User, UserDto> {

	@Override
	public User dtoToEntity(UserDto dto) {
		User user = new User();
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		return user;
	}

	@Override
	public UserDto entityToDto(User entity) {
		UserDto dto = new UserDto();
		dto.setUsername(entity.getUsername());
		dto.setPassword(entity.getPassword());
		return dto;
	}

}
