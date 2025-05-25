package com.cenoradev.dslist_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenoradev.dslist_project.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
