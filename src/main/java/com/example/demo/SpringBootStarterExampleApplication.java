package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class SpringBootStarterExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterExampleApplication.class, args);
	}
	
	@GetMapping("/scream")
	public String sayHello() {
		return "Hello KiranKumar Atmakuri";
	}

}
