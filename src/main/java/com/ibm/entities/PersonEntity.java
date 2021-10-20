package com.ibm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "person")
public class PersonEntity{
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	public PersonEntity() {}
	
	public PersonEntity( String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
