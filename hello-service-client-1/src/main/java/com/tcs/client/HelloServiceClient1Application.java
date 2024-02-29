package com.tcs.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@EnableHystrixDashboard
//@EnableCircuitBreaker
//@EnableDiscoveryClient
@SpringBootApplication
public class HelloServiceClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceClient1Application.class, args);
	}
	@Bean
	public RestTemplate makeTemplate() {
		return new RestTemplate();
	}

}
