package com.lucas.dspesquisa.dto;

import java.io.Serializable;

import com.lucas.dspesquisa.entities.Game;
import com.lucas.dspesquisa.entities.enums.Platform;

public class GameDto implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String title;
	private Platform platform;
	
	public GameDto() {}
	
	public GameDto(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		platform = entity.getPlatform();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return title;
	}

	public void setName(String name) {
		this.title = name;
	}

	public Platform getPlataform() {
		return platform;
	}

	public void setPlataform(Platform plataform) {
		this.platform = plataform;
	}
	

}
