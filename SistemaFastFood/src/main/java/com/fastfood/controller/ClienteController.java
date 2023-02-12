package com.fastfood.controller;

import org.apache.tomcat.util.digester.RuleSet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fastfood.model.Cliente;
import com.fastfood.model.Propriedade;
import com.fastfood.repository.ClienteRepository;
import com.fastfood.repository.PropriedadeRepository;
import com.fastfood.repository.RepositoryTest;
import com.fastfood.service.ClienteService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.var;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/cliente")
@Getter
@Setter
@AllArgsConstructor
public class ClienteController {		

	ClienteService clienteService;
	RepositoryTest repositoryTest;

	/*@GetMapping("/all")
	public ResponseEntity< Iterable<Propriedade>> allPropriedades(){
		return ResponseEntity.status(HttpStatus.OK).body(propriedadeRepository.findAll());
	}*/

	/*@PostMapping
	public ResponseEntity<Propriedade> createPropriedade(@RequestBody Propriedade propriedade) {
		System.out.println("Propriedade" + propriedade.getNome());
		return ResponseEntity.status(HttpStatus.OK).body(propriedadeRepository.save(propriedade));
	}*/

	/*@GetMapping(value = "/find/{filtro}")
	List<Propriedade> findByFiltro(@PathVariable("filtro")	String filtro) {
		System.out.println("Filtro: " + filtro);
		return repository.findByFiltro(filtro);
	}*/

	@GetMapping(value = "/create-client-test")
	ResponseEntity<?> createClientsWithJava() {
		String result = repositoryTest.salvar();
		return ResponseEntity.ok().body(result);
	}

	/*@PostMapping(value = "/create-client")
	public ResponseEntity<String> createCliente(@RequestBody Cliente c){
		clienteRepository.save(c);
		return ResponseEntity.ok().body(c.getNome() + " - " + c.getEndereco());
	}*/

	@GetMapping(value =  "/all")
	public ResponseEntity<?> list(){
		var result = clienteService.allClientes();
		return ResponseEntity.ok().body(result);
	}
}
