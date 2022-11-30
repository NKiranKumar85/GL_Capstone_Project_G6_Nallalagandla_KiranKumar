package com.example.MicroServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServerApplication.class, args);
	}

}