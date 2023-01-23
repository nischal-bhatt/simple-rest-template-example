package com.example.demoporject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class Student {
	public Student() {
		
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

@RestController
public class controllerFellow {

	@GetMapping("/getStudents")
	public List<Student> getStudent()
	{
		List<Student> a = new ArrayList<>();
		Student a1 = new Student(); a1.setName("hey");
		Student a2 = new Student(); a2.setName("hey2");
		Student a3 = new Student(); a3.setName("hey3");
		Student a4 = new Student(); a4.setName("fukbalut");
		Student a5 = new Student(); a5.setName("fukbalut-nishbnish");
		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		a.add(a5);
		return a;
	}
}
