package com.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsDeploymentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDeploymentAppApplication.class, args);
	}
	
	@GetMapping("/")
	public String Hellow() {
		return "This app is deployed on the ec2 instance";
	}

}
