package com.xworkz.ConstructorOverLoading;

public class Fish {
	public String name;
	public String type;
	public double price;
	public int weight;
	public float length;

	public Fish() {
		System.out.println("Fish created");
	}

	public Fish(String name) {
		this.name = name;
	}

	public Fish(double price) {
		this.price = price;
	}

	public Fish(int weight) {
		this.weight = weight;
	}

	public Fish(float length) {
		this.length = length;
	}

	public Fish(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Fish(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Fish(int weight, float length) {
		this.length = length;
		this.weight = weight;
	}

}