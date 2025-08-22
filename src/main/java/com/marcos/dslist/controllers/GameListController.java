package com.marcos.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.dslist.dto.GameListDto;
import com.marcos.dslist.dto.GameMinDto;
import com.marcos.dslist.services.GameListService;
import com.marcos.dslist.services.GameService;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping()
    public ResponseEntity<List<GameListDto>> findAll() {
        List<GameListDto> result = gameListService.findAll();
        
        return new ResponseEntity<List<GameListDto>>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/{listId}/games")
    public ResponseEntity<List<GameMinDto>> findByList(@PathVariable Long listId) {
        List<GameMinDto> result = gameService.findByList(listId);
        
        return new ResponseEntity<List<GameMinDto>>(result, HttpStatus.OK);
    }
}
