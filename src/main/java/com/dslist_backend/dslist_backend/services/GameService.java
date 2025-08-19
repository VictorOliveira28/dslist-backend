package com.dslist_backend.dslist_backend.services;

import com.dslist_backend.dslist_backend.dtos.GameDTO;
import com.dslist_backend.dslist_backend.dtos.GameMinDTO;
import com.dslist_backend.dslist_backend.entities.Game;
import com.dslist_backend.dslist_backend.projections.GameMinProjection;
import com.dslist_backend.dslist_backend.repositories.GameRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.beans.Transient;
import java.util.List;

@Service
public class GameService {

    private final GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = repository.findById(id).get();

        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = repository.findAll();

        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = repository.searchByList(listId);

        return result.stream().map(GameMinDTO::new).toList();
    }


}
