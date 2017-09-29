package com.weather.challenge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.challenge.dto.BoardDto;
import com.weather.challenge.dto.NewBoardDto;
import com.weather.challenge.dto.UserDataDto;
import com.weather.challenge.dto.UserDto;
import com.weather.challenge.dto.external.Place;
import com.weather.challenge.dto.external.Weather;
import com.weather.challenge.entity.Board;
import com.weather.challenge.entity.User;
import com.weather.challenge.repository.BoardRepository;
import com.weather.challenge.repository.UserRepository;

@Service
public class WeatherService {

    @Autowired
    private BoardRepository boardRepository;
    
    @Autowired
    private YahooService yahooService;

    @Autowired
    private UserRepository userRepository;
    
    public List<BoardDto> getBoards(UserDto user) {
        List<Board> boards = boardRepository.getByUserId(user.getId());
        List<BoardDto> retBoards = new ArrayList<BoardDto>();
        if (!boards.isEmpty()) {
            BoardDto boardDto = null;
            for (Board board : boards) {
                boardDto = new BoardDto();
                boardDto.setDescription(board.getDescription());
                for (String woeid : board.getWoeids()) {
					boardDto.getWeathers().add(yahooService.findWeatherByWoeid(woeid));
				}
                retBoards.add(boardDto);
            }
        }
        return retBoards;
    }

    public BoardDto getBoard(String id) {
        Board board = boardRepository.findOne(id);
        BoardDto boardDto = new BoardDto();
        boardDto.setDescription(board.getDescription());
        for (String woeid : board.getWoeids()) {
			boardDto.getWeathers().add(yahooService.findWeatherByWoeid(woeid));
		}
        return boardDto;
    }

    public void saveBoard(NewBoardDto dto, String userId) {
        Board board = new Board();
        User user = userRepository.findOne(userId);
        board.setUser(user);
        board.setDescription(dto.getDescription());
        for (Place place : dto.getPlaces()) {
			board.getWoeids().add(place.getWoeid());
		}
        boardRepository.save(board);
    }

    public void deleteBoard(String id) {
        boardRepository.delete(id);
    }

	public UserDataDto getWeatherNews(String userId) {
		User user = userRepository.findOne(userId);
		UserDto userDto = new UserDto(user.getId(), user.getUsername());
		List<Board> userBoards = boardRepository.getByUserId(userId);
		List<BoardDto> boards = new ArrayList<>();
		List<Weather> weathers = new ArrayList<>();
		for (Board board : userBoards) {
			for (String woeid: board.getWoeids()) {
				weathers.add(yahooService.findWeatherByWoeid(woeid));
			}
			boards.add(new BoardDto(board.getDescription(), weathers));
		}
		return new UserDataDto(userDto, boards);
	}

}
