package com.example.StudentCRUD.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@ComponentScan(basePackages = {"com.example.StudentCRUD.controller",
		                       "com.example.StudentCRUD.entity",
		                       "com.example.StudentCRUD.service" ,
		                       "com.example.StudentCRUD.repository"})*/
public class StudentCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCrudApplication.class, args);
	}

}
