package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan
@RestController
public class DataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataRestApplication.class, args);
	}

}
