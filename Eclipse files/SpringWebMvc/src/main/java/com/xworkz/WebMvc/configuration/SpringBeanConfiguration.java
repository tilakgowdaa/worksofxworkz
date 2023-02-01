package com.xworkz.WebMvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.WebMvc")
public class SpringBeanConfiguration {

	public SpringBeanConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
}
