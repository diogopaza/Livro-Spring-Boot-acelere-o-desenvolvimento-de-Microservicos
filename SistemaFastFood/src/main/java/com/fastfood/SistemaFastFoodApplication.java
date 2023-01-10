package com.fastfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.fastfood.repository.RepositoryTest;

@SpringBootApplication
public class SistemaFastFoodApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		RepositoryTest repository = new RepositoryTest();		
		SpringApplication.run(SistemaFastFoodApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(
			SistemaFastFoodApplication.class);
	}

}
