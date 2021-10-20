package com.ibm.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class MyFirstComponent {

	@Autowired 
	MySecondComponent mySecondComponent;
	
	
	public void sayHelloFromMyFirstComponent() {
		System.out.println("sayHelloFromMyFirstComponent");
		mySecondComponent.callHello();
		
	}
	
}
