package com.xworkz.custom.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.custom")
public class CustomConfiguration {
	public CustomConfiguration() {
		System.out.println("Created CustomConfiguration using default const...");
	}
}
