package com.example.Day16postman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ={"com.Day16postman.restcontroller"})
public class Day16PostmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day16PostmanApplication.class, args);
	}

}
