package com.xworkz.initialize.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("India")
	private String country;
	@Value("Chandrayan")
	private String name;
	@Value("12.4")
	private double budget;

	public Rocket() {
		System.out.println("Running Rocket");

	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

}
