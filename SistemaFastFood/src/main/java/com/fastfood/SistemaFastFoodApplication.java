package com.fastfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.fastfood.repository.RepositoryTest;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class SistemaFastFoodApplication extends SpringBootServletInitializer {	
	
	private RepositoryTest test;
	public static void main(String[] args) {			
		SpringApplication.run(SistemaFastFoodApplication.class, args);
	}
	
	//torna o spring boot um servlet....assim acesssando o index.html diretamente
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(
			SistemaFastFoodApplication.class);
	}*/

}
