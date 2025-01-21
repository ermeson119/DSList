package com.pratica.DSList.service;

import com.pratica.DSList.dto.GameMinDTO;
import com.pratica.DSList.entities.Game;
import com.pratica.DSList.repository.GameRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired // injetando, spring resolve as configuração.
    private GameRespository gameRespository;

    public List<GameMinDTO> fidAll(){
       List<Game> result = gameRespository.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
       return dto;
    }

}
