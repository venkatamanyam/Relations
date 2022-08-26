package com.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.entity.Student;
import com.in.service.StudentServe;

@RestController
public class Studentcont {

	
	@Autowired
	private StudentServe s;
	
	@GetMapping("/savs")
	public ResponseEntity<String> m1()
	{
		          String store = s.store();
		          
		          return new ResponseEntity<String>(store,HttpStatus.OK );
	}
	
	@GetMapping(value= {"/rets"}, produces="application/json")
	public ResponseEntity<Student> m2()
	{
		Student e = s.getStud();
		          
	    return new ResponseEntity<Student>(e,HttpStatus.OK );
	}
}
