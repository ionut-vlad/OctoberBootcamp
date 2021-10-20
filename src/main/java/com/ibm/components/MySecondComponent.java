package com.ibm.components;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {

	public void sayHelloFromMySecondComponent() {
		System.out.println("sayHelloFromMySecondComponent");
	}
	
	public void callHello() {
		System.out.println("hello");
	}
}
