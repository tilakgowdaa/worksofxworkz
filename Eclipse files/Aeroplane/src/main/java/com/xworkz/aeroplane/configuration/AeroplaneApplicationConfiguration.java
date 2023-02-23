package com.xworkz.aeroplane.configuration;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.aeroplane")
public class AeroplaneApplicationConfiguration {

	public AeroplaneApplicationConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Registering localContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Registering viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

}
