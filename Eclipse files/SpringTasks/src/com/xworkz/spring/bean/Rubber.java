package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("eraser")
	private String name;
	@Autowired
	@Qualifier("yavRubber")
	private String type;
	@Autowired
	@Qualifier("rubberRate")
	private double price;
	@Autowired
	@Qualifier("rubberBanna")
	private String color;
	@Autowired
	@Qualifier("yavShape")
	private String shape;
	@Autowired
	@Qualifier("kaddiroRubber")
	private boolean stolen;
	@Autowired
	@Qualifier("rubberSize")
	private char size;

	public Rubber() {
		System.out.println("Created Rubber...");
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public String getShape() {
		return shape;
	}

	public boolean isStolen() {
		return stolen;
	}

	public char getSize() {
		return size;
	}

}
