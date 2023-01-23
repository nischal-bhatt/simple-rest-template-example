package com.example.demoporject;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class callingApi {

	public static void main(String[] args) {
		
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Student[]> sss =restTemplate.getForEntity("http://localhost:8080/getStudents",Student[].class);
	
		System.out.println("printing status code");
		System.out.println(sss.getStatusCode().value());
		System.out.println();
	    Student[] listy =sss.getBody();
	    
	    for(Student s : listy)
	    {
	    	System.out.println("printing! baba ganoush 879");
	    	System.out.println(s.getName());
	    }
	}

}
