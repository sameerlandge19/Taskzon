package com.sameer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TaskzonApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(TaskzonApplication.class, args);
	}
	
}