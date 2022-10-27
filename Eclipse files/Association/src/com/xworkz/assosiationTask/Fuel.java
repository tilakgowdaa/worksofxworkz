package com.xworkz.assosiationTask;

public class Fuel {
	public Brand brand = new Brand("Indian", "GSTIN27891", 4);
	public Boolean special;
	public Type type = Type.Diesel;
	public double price;
	public double quantity;

	public Fuel(Boolean special, double price, double quantity) {
		this.special = special;
		this.price = price;
		this.quantity = quantity;
	}

	public void showOff() {
		System.out.println(this.special);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(brand.location);
		System.out.println(type);
	}
}
