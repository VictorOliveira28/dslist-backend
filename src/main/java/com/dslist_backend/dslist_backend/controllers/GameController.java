package com.dslist_backend.dslist_backend.controllers;

import com.dslist_backend.dslist_backend.dtos.GameMinDTO;
import com.dslist_backend.dslist_backend.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = service.findAll();
        return result;
    }
}
