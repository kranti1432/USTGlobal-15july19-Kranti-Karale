package com.usttyspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

//@Configuration            //removed configuration of hibernate with jpa
public class ORMConfig {
	
	//@Bean
	public LocalEntityManagerFactoryBean ormConfiguration() {
		LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("employee-unit");
		return bean;
	}

}
