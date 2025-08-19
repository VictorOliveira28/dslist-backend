package com.dslist_backend.dslist_backend.services;

import com.dslist_backend.dslist_backend.dtos.GameListDTO;
import com.dslist_backend.dslist_backend.entities.GameList;
import com.dslist_backend.dslist_backend.repositories.GameListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository repository;

    public GameListService(GameListRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = repository.findAll();

        return result.stream().map(GameListDTO::new).toList();
    }
}
