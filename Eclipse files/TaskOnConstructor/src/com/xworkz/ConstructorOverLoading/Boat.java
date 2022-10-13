package com.xworkz.ConstructorOverLoading;

public class Boat {
	public String name;
	public char color;
	public String companyName;
	public String type;
	public String owner;

	public Boat() {
		System.out.println("Boat created");
	}

	public Boat(String name) {
		this.name = name;
	}

	public Boat(String name, char color) {
		this.name = name;
		this.color = color;
	}

	public Boat(String name, char color, String companyName) {
		this.name = name;
		this.color = color;
		this.companyName = companyName;
	}

	public Boat(String name, char color, String companyName, String type) {
		this.name = name;
		this.color = color;
		this.companyName = companyName;
		this.type = type;
	}

	public Boat(String name, String companyName) {
		this.name = name;
		this.companyName = companyName;
	}

	public Boat(String name, String companyName, String type) {
		this.name = name;
		this.type = type;
		this.companyName = companyName;
	}

	public Boat(String name, String companyName, String type, String owner) {
		this.name = name;
		this.owner = owner;
		this.companyName = companyName;
		this.type = type;
	}
}
