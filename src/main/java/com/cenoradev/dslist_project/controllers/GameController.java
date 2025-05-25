package com.cenoradev.dslist_project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenoradev.dslist_project.dto.GameMinDTO;
import com.cenoradev.dslist_project.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
        
}
