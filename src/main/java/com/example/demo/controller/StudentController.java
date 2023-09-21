package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;

	@PostMapping("/student")
	public Student saveAllRecord(@RequestBody Student student) {
		return service.saveARecord(student);
	}
	
	@GetMapping("/student/{sid}")
	public Student findById(@PathVariable Integer sid) {
		return service.findById(sid);
	}
	
	@GetMapping("/studentlist")
	public List<Student> findAllStudent() {
		return service.findAllRecord();
	}
	
	@GetMapping("/student/{location}")
	public List<Student> findLocation(@RequestBody String location) {
		return service.findByLocation(location);
	}
}
