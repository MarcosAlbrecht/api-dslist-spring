package com.marcos.dslist.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {

    @GetMapping()
    public ResponseEntity<?> getInitalRoute() {
        Map<String, String> responseBody = new HashMap<>();
            responseBody.put("message", "API is running");
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }
}
