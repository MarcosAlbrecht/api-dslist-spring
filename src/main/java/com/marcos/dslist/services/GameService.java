package com.marcos.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcos.dslist.dto.GameDto;
import com.marcos.dslist.entities.Game;
import com.marcos.dslist.repositories.GameRepository;



@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<Game> findAll(){
        List<Game> res = gameRepository.findAll();
        return res;
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game res = gameRepository.findById(id).get();
        return new GameDto(res);
    }
}
