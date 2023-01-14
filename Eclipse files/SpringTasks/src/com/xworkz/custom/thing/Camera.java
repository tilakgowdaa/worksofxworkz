package com.xworkz.custom.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;

	public Camera() {
		System.out.println("Created Company using default const...");
	}
	
	public void check() {
		System.out.println(this.lens.hashCode()+" "+this.battery.hashCode());
	}
}
