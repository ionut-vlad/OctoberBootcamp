package com.ibm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ibm.components.MyFirstBean;

@Configuration
public class BeanConfig {

	@Bean
	public MyFirstBean getMyFirstBean() { 
		return new MyFirstBean("myFirstBean, haha. it's default");
	}
	
}
