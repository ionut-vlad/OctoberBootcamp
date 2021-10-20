package com.ibm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.Person;
import com.ibm.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;

	@GetMapping("/persons")
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}
}
