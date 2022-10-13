package com.xworkz.ConstructorOverLoading;

public class Bread {
	public String type;
	public String shape;
	public double price;
	public int quantity;
	public String companyName;

	public Bread() {
		System.out.println("Bread created");
	}

	public Bread(String type) {
		this.type = type;
	}

	public Bread(String type, String shape) {
		this.type = type;
		this.shape = shape;
	}

	public Bread(String type, String shape, double price) {
		this.type = type;
		this.shape = shape;
		this.price = price;
	}

	public Bread(String type, String shape, double price, int quantity) {
		this.type = type;
		this.shape = shape;
		this.price = price;
		this.quantity = quantity;
	}

	public Bread(String type, String shape, double price, int quantity, String companyName) {
		this.type = type;
		this.shape = shape;
		this.price = price;
		this.quantity = quantity;
		this.companyName = companyName;
	}

	public Bread(double price,int quantity) {
		this.price=price;
		this.quantity = quantity;
	}

	public Bread(int quantity,String companyName) {
		this.quantity=quantity;
		this.companyName=companyName;
	}

}
