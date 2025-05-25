package com.cenoradev.dslist_project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cenoradev.dslist_project.dto.GameDTO;
import com.cenoradev.dslist_project.dto.GameMinDTO;
import com.cenoradev.dslist_project.entities.Game;
import com.cenoradev.dslist_project.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> allGameInfo = gameRepository.findAll();
        return allGameInfo.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
