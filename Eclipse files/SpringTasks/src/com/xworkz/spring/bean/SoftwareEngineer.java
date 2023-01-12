package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("engName")
	private String name;
	@Autowired
	@Qualifier("sambala")
	private double salary;
	@Autowired
	@Qualifier("office")
	private String companyName;
	@Autowired
	@Qualifier("years")
	private double experience;

	public SoftwareEngineer() {
		System.out.println("Created SoftwareEngineer...");
	}

	public String getCompanyName() {
		return companyName;
	}

	public double getExperience() {
		return experience;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}
