package com.marcos.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.dslist.dto.GameDto;
import com.marcos.dslist.dto.GameMinDto;
import com.marcos.dslist.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping()
    public ResponseEntity<List<GameMinDto>> findAll() {
        List<GameMinDto> result = gameService.findAll();
        
        return new ResponseEntity<List<GameMinDto>>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GameDto> getById(@PathVariable Long id) {
        GameDto result = gameService.findById(id);
        
        return new ResponseEntity<GameDto>(result, HttpStatus.OK);
    }
}
