package com.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	List<Student> theStudent = new ArrayList<Student>();

	@PostConstruct
	public List<Student> getList() {
		theStudent = new ArrayList<Student>();

		theStudent.add(new Student("firstName", "LastName"));
		theStudent.add(new Student("SecondName", "LastName"));
		theStudent.add(new Student("ThirdName", "LastName"));

		return theStudent;

	}

	@GetMapping("/students")
	public List<Student> getStudent() {

		return theStudent;
	}

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {

		if (studentId >= theStudent.size() || studentId < 0) {
			throw new StudentNotFoundException("Student Not found " + studentId);
		}

		return theStudent.get(studentId);

	}
	
}
