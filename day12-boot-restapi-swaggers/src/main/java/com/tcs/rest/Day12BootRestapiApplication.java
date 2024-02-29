package com.tcs.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2 
//comment above for swaggers
//http://localhost:9890/swagger-ui/index.html ->url for swaggers
public class Day12BootRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day12BootRestapiApplication.class, args);
	}

}
