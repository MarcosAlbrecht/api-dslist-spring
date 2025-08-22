package com.marcos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
