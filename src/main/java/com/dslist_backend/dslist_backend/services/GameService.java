package com.dslist_backend.dslist_backend.services;

import com.dslist_backend.dslist_backend.dtos.GameMinDTO;
import com.dslist_backend.dslist_backend.entities.Game;
import com.dslist_backend.dslist_backend.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    private GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    public List<GameMinDTO> findAll(){
        List<Game> result = repository.findAll();

        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }


}
