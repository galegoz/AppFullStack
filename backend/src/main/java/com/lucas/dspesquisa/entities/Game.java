package com.lucas.dspesquisa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.lucas.dspesquisa.entities.enums.Platform;

public class Game implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String title;
	private Platform platform;
	
	private Genre genre;
	
	private List<Game> game = new ArrayList<>();
	
	public Game() {}

	public Game(long id, String title, Platform platform, Genre genre) {
		super();
		this.id = id;
		this.title = title;
		this.platform = platform;
		this.genre = genre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
		

	public List<Game> getGame() {
		return game;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

	
	

}
