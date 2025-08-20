package com.marcos.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.dslist.dto.GameMinDto;
import com.marcos.dslist.entities.Game;
import com.marcos.dslist.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping()
    public ResponseEntity<List<GameMinDto>> getInitalRoute() {
        List<Game> result = gameService.findAll();
        List<GameMinDto> dto = result.stream().map(game -> new GameMinDto(game)).toList();
        return new ResponseEntity<List<GameMinDto>>(dto, HttpStatus.OK);
    }
}
