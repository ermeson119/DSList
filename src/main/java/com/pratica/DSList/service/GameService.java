package com.pratica.DSList.service;

import com.pratica.DSList.dto.GameDTO;
import com.pratica.DSList.dto.GameMinDTO;
import com.pratica.DSList.entities.Game;
import com.pratica.DSList.repository.GameRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired // injetando, spring resolve as configuração.
    private GameRespository gameRespository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> fidAll(){
       List<Game> result = gameRespository.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
       return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO fidByGameId(Long id){
        Game result = gameRespository.findById(id).get();
        return new GameDTO(result);
    }
}
