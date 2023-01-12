package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String name;
	private String type;
	@Autowired
	@Qualifier("engineNo")
	private int number;
	@Autowired
	@Qualifier("engineVersion")
	private double version;
	private String company;
	private int stroke;

	public Engine(@Qualifier("engineName") String name, @Qualifier("engineType") String type,
			@Qualifier("engineCompany") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	public int getStroke() {
		return stroke;
	}
	
	@Autowired
	@Qualifier("engineStroke")
	public void setStroke(int stroke) {
		this.stroke = stroke;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getNumber() {
		return number;
	}

	public String getCompany() {
		return company;
	}

}
