package com.linbsoft.microservicehystrixturbine8503;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class MicroserviceHystrixTurbine8503Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceHystrixTurbine8503Application.class, args);
	}

}

