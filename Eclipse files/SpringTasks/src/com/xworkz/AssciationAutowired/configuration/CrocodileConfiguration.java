package com.xworkz.crocodile.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.crocodile")
public class CrocodileConfiguration {
	
	public CrocodileConfiguration() {
		System.out.println("Created CrocodileConfiguration");
	}

}
