package com.xworkz.TaskOnEncapsulation;

public class Toothpaste {
	public String name="persudent";
	public String color="blue";
	public double price=100.0;
	public char size;
	public int weight;
	public String flavour;
	public String company;
	public String mftDate;
	public String expDate;
	public String transport;
	public boolean available;

	void setToothpaste(String name, String color, double price, char size, int weight, String flavour, String company,
			String mftDate, String expDate, String transport, boolean available) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.size = size;
		this.weight = weight;
		this.flavour = flavour;
		this.company = company;
		this.mftDate = mftDate;
		this.expDate = expDate;
		this.transport = transport;
		this.available = available;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public char getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}

	public String getFlavour() {
		return flavour;
	}

	public String getCompany() {
		return company;
	}

	public String getMftDate() {
		return mftDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public String getTransport() {
		return transport;
	}

	public boolean isAvailable() {
		return available;
	}

}
