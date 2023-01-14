package com.xworkz.custom.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	private Director director;
	@Autowired
	private CameraMan cameraMan;
	@Autowired
	private Producer producer;

	public Movie() {
		System.out.println("Created Movie using default const...");
	}

	public void check() {
		System.out.println(this.director.hashCode() + " " + this.cameraMan.hashCode() + " " + this.producer.hashCode());
	}
}
