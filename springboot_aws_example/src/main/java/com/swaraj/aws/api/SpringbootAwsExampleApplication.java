package com.swaraj.aws.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAwsExampleApplication {
	@GetMapping("/")
	public String home() {
		return "Hello World This is Swaraj Welcome to AWS";
	}

	public static void main(String[] args) {
		
		//https://swarajawsphase5.s3.amazonaws.com/spring-boot-aws.jar
		SpringApplication.run(SpringbootAwsExampleApplication.class, args);
	}

}
