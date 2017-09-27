package com.weather.challenge.mapper;

public interface Mapeable<A, B> {

	A dtoToEntity(B dto);

	B entityToDto(A entity);

}
