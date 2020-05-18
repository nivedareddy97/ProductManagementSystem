package com.capgemini.god;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GreatOutdoorDocumentation2Application {

	public static void main(String[] args) {
		SpringApplication.run(GreatOutdoorDocumentation2Application.class, args);
	}

}
