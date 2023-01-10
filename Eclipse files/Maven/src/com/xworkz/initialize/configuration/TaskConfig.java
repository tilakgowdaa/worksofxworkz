package com.xworkz.initialize.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.initialize.thing.Actor;
import com.xworkz.initialize.thing.Rocket;
import com.xworkz.initialize.thing.Season;

@Configuration
@ComponentScan("com.xworkz.initialize")
public class TaskConfig {
	
	public TaskConfig() {
	System.out.println("Created Rocket");
	System.out.println("Created Actor");
	}
	
	@Bean
	public Rocket jacket() {
		System.out.println("Registering New Rocket");
		Rocket rocket=new Rocket();
		return rocket;
	}
	
	@Bean
	public Actor hero() {
		System.out.println("Registering new Actor");
		Actor actor=new Actor("Dr Puneeth raj", "Kannada", 48);
		return actor;
	}
	
	@Bean
	public Season cold() {
		System.out.println("Registering new Season");
		Season season=new Season();
		return season;
	}
	
}
