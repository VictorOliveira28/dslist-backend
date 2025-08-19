package com.dslist_backend.dslist_backend.controllers;

import com.dslist_backend.dslist_backend.dtos.GameDTO;
import com.dslist_backend.dslist_backend.dtos.GameListDTO;
import com.dslist_backend.dslist_backend.dtos.GameMinDTO;
import com.dslist_backend.dslist_backend.services.GameListService;
import com.dslist_backend.dslist_backend.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    private final GameListService service;

    private final GameService gameService;

    public GameListController(GameListService service, GameService gameService) {
        this.service = service;
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = service.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

}
