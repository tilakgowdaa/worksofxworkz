package com.xworkz.foodItems.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.foodItems")
public class FoodItemConfiguration {
	public FoodItemConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
}
