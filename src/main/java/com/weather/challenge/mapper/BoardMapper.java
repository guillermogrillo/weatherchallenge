package com.weather.challenge.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weather.challenge.dto.BoardDto;
import com.weather.challenge.entity.Board;

/**
 *	Componente que mapea Board - BoardDto y viceversa 
 *
 */

@Component
public class BoardMapper implements Mapeable<Board, BoardDto> {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Board dtoToEntity(BoardDto dto) {
		Board board = new Board();
		board.setDescription(dto.getDescription());
		board.setUser(userMapper.dtoToEntity(dto.getUser()));
		return board;
	}

	@Override
	public BoardDto entityToDto(Board entity) {
		BoardDto boardDto = new BoardDto();
		boardDto.setDescription(entity.getDescription());
		boardDto.setUser(userMapper.entityToDto(entity.getUser()));
		return boardDto;
	}

}
