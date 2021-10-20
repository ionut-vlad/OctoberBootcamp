package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.ibm.components.MyFirstBean;
import com.ibm.components.MyFirstComponent;
import com.ibm.components.MySecondComponent;
import com.ibm.entities.PersonEntity;
import com.ibm.repositories.PersonRepository;

@SpringBootApplication
public class MyFirstProjectApplication {

	@Autowired
	MyFirstComponent myFirstComponent;

	@Autowired
	MySecondComponent mySecondComponent;

	@Autowired
	MyFirstBean myFirstBean;
	
	@Autowired
	PersonRepository personRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
	}

	
	@EventListener(ApplicationReadyEvent.class)
	public void initSomeDataAfterStartup() {
//		myFirstComponent.sayHelloFromMyFirstComponent();
//		mySecondComponent.sayHelloFromMySecondComponent();
//		System.out.println(myFirstBean.getName());
		
		
		PersonEntity myFirstPerson = new PersonEntity( "Jane", "Fonda");
		
		personRepository.save(myFirstPerson);
		update(myFirstPerson);
		personRepository.saveAndFlush(myFirstPerson);
		
		
		
	}

	private void update(PersonEntity entity) { 
		entity.setName(null);
	}
	
	
}
