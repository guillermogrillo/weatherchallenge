package com.weather.challenge.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.challenge.entity.Board;
import com.weather.challenge.entity.Location;
import com.weather.challenge.repository.BoardRepository;
import com.weather.challenge.repository.LocationRepository;

@Service
public class WeatherService implements BoardService, LocationService {

	private BoardRepository boardRepository;

	private LocationRepository locationRepository;

//	@Autowired
//	public WeatherService(BoardRepository boardRepository, LocationRepository locationRepository) {
//		this.boardRepository = boardRepository;
//		this.locationRepository = locationRepository;
//	}

	@Override
	public void saveLocation() {
		Location location = new Location();
		location.setId("123");
		location.setDescription("Descripcion");
//		locationRepository.save(location);
	}

	@Override
	public void deleteLocation() {
//		locationRepository.delete("123");
	}

	@Override
	public Board getBoard(String id) {
		Board board = new Board();
		board.setId("1");
		board.setDescription("lalala");
		return board;
	}

	@Override
	public Iterable<Board> getBoards(String user) {
//		Iterable<Board> boards = boardRepository.findAll();
//		return boards;
		return null;
	}

	@Override
	public void saveBoard() {
		Board board = new Board();
		board.setId("1");
		board.setDescription("board 1");
		board.setLocations(new ArrayList<Location>());
//		boardRepository.save(board);
	}

	@Override
	public void deleteBoard() {
//		boardRepository.delete("1");
	}
}
