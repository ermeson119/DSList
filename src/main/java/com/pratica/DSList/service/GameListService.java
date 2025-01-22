package com.pratica.DSList.service;

import com.pratica.DSList.dto.GameListDTO;
import com.pratica.DSList.entities.GameList;
import com.pratica.DSList.repository.GameListRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired // injetando, spring resolve as configuração.
    private GameListRespository gameListRespository;

    @Transactional(readOnly = true)
    public List<GameListDTO> fidAll(){
       List<GameList> result = gameListRespository.findAll();
       List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
       return dto;
    }


}
