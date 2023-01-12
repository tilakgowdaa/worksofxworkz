package com.xworkz.spring.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("naama")
	private String name;
	@Autowired
	@Qualifier("vers")
	private double version;
	@Autowired
	@Qualifier("father")
	private String developer;
	@Autowired
	private LocalDate date;
	@Autowired
	@Qualifier("fullufree")
	private boolean free;

	public Software() {
		System.out.println("Created Software...");
	}

	public String getName() {
		return name;
	}

	public double getVersion() {
		return version;
	}

	public String getDeveloper() {
		return developer;
	}

	public LocalDate getDate() {
		return date;
	}

	public boolean isFree() {
		return free;
	}

}
