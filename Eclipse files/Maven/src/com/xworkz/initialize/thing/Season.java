package com.xworkz.initialize.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;
	private double duration;
	private String startingMonth;

	public Season() {
		System.out.println("Running Season");
	}

	public String getName() {
		return name;
	}

	@Value("Winter")
	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	@Value("4")
	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("Oct")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
