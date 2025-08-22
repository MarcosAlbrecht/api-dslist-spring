package com.marcos.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.dslist.dto.GameListDto;
import com.marcos.dslist.services.GameListService;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping()
    public ResponseEntity<List<GameListDto>> findAll() {
        List<GameListDto> result = gameListService.findAll();
        
        return new ResponseEntity<List<GameListDto>>(result, HttpStatus.OK);
    }
}
