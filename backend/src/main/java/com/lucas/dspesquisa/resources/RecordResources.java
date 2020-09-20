package com.lucas.dspesquisa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.dspesquisa.dto.RecordDto;
import com.lucas.dspesquisa.dto.RecordInsertDTO;
import com.lucas.dspesquisa.services.RecordServices;

@RestController
@RequestMapping(value = "/records")
public class RecordResources {
	
	@Autowired
	private RecordServices service;
	
	@PostMapping
	public ResponseEntity<RecordDto> insert(@RequestBody RecordInsertDTO dto){
		RecordDto newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
	}

}
