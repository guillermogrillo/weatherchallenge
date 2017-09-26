package controller;

import entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.WeatherService;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping(value = "/boards")
    public Board getBoard() {
        return weatherService.getBoard("1");
    }

    @GetMapping(value = "/boards/{id}")
    public Iterable<Board> getBoard(@PathVariable String id) {
        return weatherService.getBoards("asd");
    }

    @PostMapping(value = "/board")
    public void saveBoard() {
        weatherService.saveBoard();
    }

    @DeleteMapping(value = "/board")
    public void deleteBoard() {
        weatherService.deleteBoard();
    }

}
