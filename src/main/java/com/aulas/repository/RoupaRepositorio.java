package com.aulas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entidade.Roupa;
@Repository

public interface RoupaRepositorio extends CrudRepository<Roupa,Integer> {

	
	
}
