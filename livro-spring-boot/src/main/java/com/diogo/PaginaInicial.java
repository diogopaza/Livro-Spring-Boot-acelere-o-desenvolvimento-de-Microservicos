package com.diogo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PaginaInicial {
	@GetMapping
	public String home() {
		return "Olá Diogo Sênior...";
	}
}
