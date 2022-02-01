package com.springrest.studentapplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.studentapplication.Repositary.studentRepo;
import com.springrest.studentapplication.model.Student;



@RestController
public class studentController {
	
	@Autowired
	studentRepo Repo;
	
	//Here We are adding a data and return the data whatever we are add it
	
	@GetMapping("/get")
	public Student getdata() {
		Student s1=new Student();
		s1.setStudentId(4);
		s1.setStudentname("Divya Tiwari");
		s1.setStudentemail("Divya@gmail.com");
		s1.setStudentpassword(12345);
		Repo.save(s1);
		return s1;
		
	}
	 
	//Here we are delete the data by using delete method
	@DeleteMapping("/delete/{id}")
	public String deletedata(@PathVariable ("id") int id) {
		Repo.deleteById(id);
		return "dalete student data";
		
	}
	
	//here we are creating a student data by using post method.
	@PostMapping("/create")
	public Student createdata() {
		Student s2=new Student();
		s2.setStudentId(4);
		s2.setStudentname("sudha rani");
		s2.setStudentemail("sudha@gmail.com");
		s2.setStudentpassword(123);
		Repo.save(s2);
		return s2;
	}
	
	//Here we can find the list of a student.
	@GetMapping("/studentdata")
	public List<Student> getstudent() {
		return (List<Student>) Repo.findAll();
		
	}
	
	//Here you can get particular student by using id
	@GetMapping("/getstudentdata/{id}")
	public Optional<Student> getstudent(@PathVariable("id") int id) {
		return Repo.findById(id);
		
		
	}
	
	//Here you can update the data of student.
	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		Repo.save(student);
		return student;
	}
	
		
	
	
	
	
	
	
	
	
	
	
	

}
