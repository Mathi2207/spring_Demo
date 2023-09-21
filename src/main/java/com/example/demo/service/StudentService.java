package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;

	public StudentService() {
		super();
		this.repo = repo;
 	}
	
	public Student saveARecord(Student s) {
		return repo.save(s);
	}
	
	public Student findById(Integer sid) {
		return repo.findById(sid).get();
	}
	
	public List<Student> findAllRecord() {
		return repo.findAll();
	}
	
	public List<Student> findByLocation(String location) {
		return repo.findAll();
	}
	

}
