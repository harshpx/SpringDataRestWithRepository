package com.learn.RestWithRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestWithRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWithRepositoryApplication.class, args);
	}

	@Bean
	CommandLineRunner cmd () {
		return runner -> {
			System.out.println("api is running!");
		};
	}
}
