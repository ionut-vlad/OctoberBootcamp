package com.ibm.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {

//	public DataSource getDataSource() {
//		 return DataSourceBuilder
//			        .create()
//			        .username("sa")
//			        .password("sa")
//			        .url("jdbc:h2:mem:mydefaultdb")
//			        .driverClassName("org.h2.Driver")
//			        .build();
//	}
}
