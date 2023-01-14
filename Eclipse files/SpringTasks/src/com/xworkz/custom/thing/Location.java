package com.xworkz.custom.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Location {

	@Autowired
	private Area area;

	public Location() {
		System.out.println("Created Location using default const...");
	}
	
	public void check() {
		System.out.println(this.area.hashCode());
	}

}
