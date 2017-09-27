package com.weather.challenge.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weather.challenge.dto.LocationDto;
import com.weather.challenge.entity.Location;

/**
 *	Componente que mapea Location - LocationDto y viceversa 
 *
 */

@Component
public class LocationMapper implements Mapeable<Location, LocationDto> {

	@Autowired
	private BoardMapper boardMapper;

	@Override
	public Location dtoToEntity(LocationDto dto) {
		Location location = new Location();
		location.setId(dto.getId());
		location.setDescription(dto.getDescription());
		location.setBoard(boardMapper.dtoToEntity(dto.getBoard()));
		return location;
	}

	@Override
	public LocationDto entityToDto(Location entity) {
		LocationDto locationDto = new LocationDto();
		locationDto.setId(entity.getId());
		locationDto.setDescription(entity.getDescription());
		locationDto.setBoard(boardMapper.entityToDto(entity.getBoard()));
		return locationDto;
	}

}
