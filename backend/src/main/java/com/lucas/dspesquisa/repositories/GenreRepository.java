package com.lucas.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucas.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
