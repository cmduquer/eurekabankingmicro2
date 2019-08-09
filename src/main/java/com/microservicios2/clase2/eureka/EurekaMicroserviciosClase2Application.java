package com.microservicios2.clase2.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMicroserviciosClase2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMicroserviciosClase2Application.class, args);
	}

}
