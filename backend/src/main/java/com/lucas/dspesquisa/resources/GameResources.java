package com.lucas.dspesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.dspesquisa.dto.GameDto;
import com.lucas.dspesquisa.services.GamesServices;

@RestController
@RequestMapping(value = "/games")
public class GameResources {
	
	@Autowired
	private GamesServices service;
	
	@GetMapping
	public ResponseEntity<List<GameDto>> findAll(){
		List<GameDto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
