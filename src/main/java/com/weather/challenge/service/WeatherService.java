package com.weather.challenge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.challenge.dto.BoardDto;
import com.weather.challenge.dto.NewBoardDto;
import com.weather.challenge.dto.UserDto;
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
                boardDto.setId(board.getId());
                boardDto.setDescription(board.getDescription());
                for (String woeid : board.getWoeids()) {
					boardDto.getLocations().add(yahooService.findWeatherByWoeid(woeid));
				}
                retBoards.add(boardDto);
            }
        }
        return retBoards;
    }

    public void saveBoard(NewBoardDto dto, String userId) {
        Board board = new Board();
        User user = userRepository.findOne(userId);
        board.setUser(user);
        board.setDescription(dto.getDescription());
        board.getWoeids().addAll(dto.getWoeids());
        boardRepository.save(board);
    }

    public void deleteBoard(String id) {
        boardRepository.delete(id);
    }

	public void deleteLocationFromBoard(String boardId, String woeid) {
		Board board = boardRepository.findOne(boardId);
		board.getWoeids().removeIf(w -> w.equals(woeid));
		boardRepository.save(board);
	}

}
