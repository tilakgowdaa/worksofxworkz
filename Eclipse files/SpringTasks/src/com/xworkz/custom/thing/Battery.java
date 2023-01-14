package com.xworkz.custom.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	@Autowired
	private Capacity capacity;

	public Battery() {
		System.out.println("Created Battery using default const...");
	}

	public void check() {
		System.out.println(this.capacity.hashCode());
	}
}
