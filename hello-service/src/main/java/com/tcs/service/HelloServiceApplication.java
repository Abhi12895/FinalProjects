package com.tcs.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//need to learn about yml
@EnableDiscoveryClient
@SpringBootApplication
public class HelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
	}

}
