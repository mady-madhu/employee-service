package com.example.employee_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeServiceApplication  {

	public static void main(String[] args) {
		System.out.println("started");
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
