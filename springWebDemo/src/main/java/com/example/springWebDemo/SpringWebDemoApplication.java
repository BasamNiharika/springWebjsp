package com.example.springWebDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebDemoApplication {

	public static void main(String[] args) {
		//IntelliJ doesnot provide direct implementation for springBoot.It is done through
		//string Intializer(start.spring.io). But, for spring we can create new
		// maven project.
		SpringApplication.run(SpringWebDemoApplication.class, args);
	}

}
