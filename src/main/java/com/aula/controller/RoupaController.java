package com.aula.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.entity.Roupa;
import com.aula.repository.RoupaRepositorio;


@RestController
@RequestMapping("/")

public class RoupaController {

	@Autowired
	RoupaRepositorio repo;

	@GetMapping("index")
	public String getindex() {
		return "Index de Roupa";

	}

	@GetMapping("/roupa")

	public ResponseEntity<Iterable<Roupa>> getRoupa() {
		Iterable<Roupa> roupa = repo.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(roupa);
	}

	// Para pegar informaçoes da roupa atraves do ID
	@GetMapping("/roupa/{idroupa}")

	public ResponseEntity<Roupa> getRoupaById(@PathVariable("idroupa") int idroupa) {

		Optional<Roupa> roupa = repo.findById(idroupa);
		return roupa.isPresent() ? ResponseEntity.ok(roupa.get()) : ResponseEntity.notFound().build();

	}

	// Para salvar a informaçoes da roupa

	@PostMapping("/roupa")

	public ResponseEntity<Roupa> salvaoupa(@RequestBody Roupa roupa) {
		Roupa roupinha = repo.save(roupa);
		return ResponseEntity.status(HttpStatus.CREATED).body(roupinha);

	}
	//

	
	

	//Endpoint de deletação 
	@DeleteMapping("/roupa/{idroupa}")

	public String deleteContato(@PathVariable("idroupa") int idroupa) {
		return "Roupa excluida dessa lista" + idroupa;
	}

	
	//Criação do endpoint PUT: para alteração de informaçoes
	@PutMapping("/roupa/{idroupa}")

	public String alteraroupa(@PathVariable("idroupa") int idroupa, @RequestBody String roupa) {

		return roupa;
	}

}