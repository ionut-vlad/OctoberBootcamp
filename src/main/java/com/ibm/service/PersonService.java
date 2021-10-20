package com.ibm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entities.PersonEntity;
import com.ibm.model.Person;
import com.ibm.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired PersonRepository personRepo;
	
	public List<Person> getAllPersons() {
		return personRepo.findAll()
				.stream()
				.map(e -> mapEntityToPerson(e))
				.collect(Collectors.toList());
	}
	
	public void savePerson(Person person) {
		PersonEntity myFirstPerson = new PersonEntity( person.getName(), person.getSurname());
		
		personRepo.save(myFirstPerson);
	}
	
	public Person mapEntityToPerson(PersonEntity entity) {
		return new Person(entity);
	}
}
