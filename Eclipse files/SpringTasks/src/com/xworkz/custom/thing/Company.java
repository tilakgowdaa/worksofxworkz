package com.xworkz.custom.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Location location;

	public Company() {
		System.out.println("Created Company using default const...");
	}
	
	public void check() {
		System.out.println(this.location.hashCode());
	}
}
