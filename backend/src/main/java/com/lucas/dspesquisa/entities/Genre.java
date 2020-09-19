package com.lucas.dspesquisa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Genre implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	
	private List<Game> games = new ArrayList<>();
	
	public Genre() {}
	
	
	public Genre(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		

	public List<Game> getGames() {
		return games;
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
		Genre other = (Genre) obj;
		if (id != other.id)
			return false;
		return true;
	};
	

}
