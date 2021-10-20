package com.ibm.model;
import com.ibm.entities.PersonEntity;

public class Person {
	
	private String name;
	private String surname;
	
	public Person(PersonEntity entity) {
		this.name = entity.getName();
		this.surname = entity.getSurname();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}