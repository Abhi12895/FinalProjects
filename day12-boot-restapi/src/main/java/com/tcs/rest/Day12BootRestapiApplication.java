package com.tcs.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"go.dummy.test"})//used when class is outside package
public class Day12BootRestapiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Day12BootRestapiApplication.class, args);
		String beans[]=context.getBeanDefinitionNames();
		
		for(String b:beans) {
			System.out.println(b);
		}
	}

}
