package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context	= SpringApplication.run(Project2Application.class, args);
		Home h1 = context.getBean(Home.class);
		h1.connect();
		Home h2 = context.getBean(Home.class);
		h2.connect();
		
		 
	}

}
