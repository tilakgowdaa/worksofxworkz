package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("sisa")
	private String name;
	@Autowired
	@Qualifier("yavPencil")
	private String type;
	@Autowired
	@Qualifier("rate")
	private double price;
	@Autowired
	@Qualifier("banna")
	private String color;
	@Autowired
	@Qualifier("sharp")
	private boolean sharped;
	@Autowired
	@Qualifier("kadMaal")
	private boolean stolen;

	public Pencil() {
		System.out.println("Created pencil...");
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public boolean isSharped() {
		return sharped;
	}

	public boolean isStolen() {
		return stolen;
	}

}
