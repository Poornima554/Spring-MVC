package com.dcl.sdb;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dcl.sdb")
public class AppConfig {
	
	@Bean
	public EntityManagerFactory getFactory() {
		return Persistence.createEntityManagerFactory("mysql-config");
	}
	

}
