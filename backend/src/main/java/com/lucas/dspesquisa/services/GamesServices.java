package com.lucas.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucas.dspesquisa.dto.GameDto;
import com.lucas.dspesquisa.entities.Game;
import com.lucas.dspesquisa.repositories.GameRepository;

@Service
public class GamesServices {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDto> findAll(){
		 List<Game> list = repository.findAll();
		 return list.stream().map(x -> new GameDto(x)).collect(Collectors.toList());
	}
	
	

}
