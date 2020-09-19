package com.lucas.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
