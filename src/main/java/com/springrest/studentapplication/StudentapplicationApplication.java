package com.springrest.studentapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springrest.studentapplication.Repositary.studentRepo;
import com.springrest.studentapplication.model.Student;

@SpringBootApplication
public class StudentapplicationApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(StudentapplicationApplication.class, args);
		
	}

}
