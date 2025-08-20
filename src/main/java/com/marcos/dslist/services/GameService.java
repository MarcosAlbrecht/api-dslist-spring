package com.marcos.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.dslist.entities.Game;
import com.marcos.dslist.repositories.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<Game> findAll(){
        List<Game> res = gameRepository.findAll();
        return res;
    }
}
