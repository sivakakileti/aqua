package com.Aqua.Solutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan(basePackages =  {"com.model", "com.Aqua.Solutions","com.controllers","com.repositories","com.Dao", "com.service"})
@EntityScan("com.model")

public class AquaSolutionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AquaSolutionsApplication.class, args);
	}

}
