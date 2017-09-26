package service;

import entity.Board;

import java.util.List;

public interface BoardService {

    Board getBoard(String id);

    Iterable<Board> getBoards(String user);

    void saveBoard();

    void deleteBoard();


}
