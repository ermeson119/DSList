package com.pratica.DSList.dto;

import com.pratica.DSList.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
