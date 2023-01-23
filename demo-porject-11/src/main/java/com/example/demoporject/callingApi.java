package com.example.demoporject;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

class Studentyy {
	private String namezzz;

	public String getA() {
		return namezzz;
	}

	public void setB(String name) {
		this.namezzz = name;
	}
	
}

public class callingApi {

	public static void main(String[] args) {
		
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Studentyy[]> sss =restTemplate.getForEntity("http://localhost:8080/getStudents",Studentyy[].class);
	
		System.out.println("printing status code");
		System.out.println(sss.getStatusCode().value());
		System.out.println();
	    Studentyy[] listy =sss.getBody();
	    
	    for(Studentyy s : listy)
	    {
	    	System.out.println("printing! baba ganoush");
	    	System.out.println(s.getA());
	    }
	}

}
