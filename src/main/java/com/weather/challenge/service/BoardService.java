package com.weather.challenge.service;

import com.weather.challenge.entity.Board;

public interface BoardService {

    Board getBoard(String id);

    Iterable<Board> getBoards(String user);

    void saveBoard();

    void deleteBoard();


}
