package com.example.javakbtgbootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JavaKbtgBootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaKbtgBootcampApplication.class, args);
	}

	@GetMapping("/")
	public String HealthCheck () {
		return "Success";
	}
}
