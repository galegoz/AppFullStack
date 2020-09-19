package com.lucas.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucas.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
