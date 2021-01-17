 package com.lucas.dspesquisa.services;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucas.dspesquisa.dto.RecordDto;
import com.lucas.dspesquisa.dto.RecordInsertDTO;
import com.lucas.dspesquisa.entities.Game;
import com.lucas.dspesquisa.entities.Record;
import com.lucas.dspesquisa.repositories.GameRepository;
import com.lucas.dspesquisa.repositories.RecordRepository;

@Service
public class RecordServices {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional
	public RecordDto insert(RecordInsertDTO dto) {
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
			
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);		
		return new RecordDto(entity);
	}


	@Transactional(readOnly = true)
	public Page<RecordDto> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {	
		return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDto(x));
	}
		
}
