package com.pratica.DSList.repository;

import com.pratica.DSList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRespository extends JpaRepository<Game, Long> {

}
