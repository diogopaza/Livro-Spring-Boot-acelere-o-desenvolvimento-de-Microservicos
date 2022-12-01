package com.fastfood.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.fastfood.model.Propriedade;
import com.fastfood.repository.PropriedadeRepository;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/api")
@Getter
@Setter
public class PropriedadeController {

	PropriedadeRepository repository;

	public PropriedadeController(PropriedadeRepository r) {
		this.repository = r;
	}

	@GetMapping("/all")
	public ResponseEntity< Iterable<Propriedade>> allPropriedades(){
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}

	@PostMapping
	public ResponseEntity<Propriedade> createPropriedade(@RequestBody Propriedade propriedade) {
		System.out.println("Propriedade" + propriedade.getNome());
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(propriedade));
	}

	@GetMapping(value = "/find/{filtro}")
	List<Propriedade> findByFiltro(@PathVariable("filtro")	String filtro) {
		System.out.println("Filtro: " + filtro);
		return repository.findByFiltro(filtro);
	}

}
