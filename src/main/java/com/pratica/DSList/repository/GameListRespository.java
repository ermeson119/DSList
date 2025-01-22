package com.pratica.DSList.repository;

import com.pratica.DSList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRespository extends JpaRepository<GameList, Long> {

}
