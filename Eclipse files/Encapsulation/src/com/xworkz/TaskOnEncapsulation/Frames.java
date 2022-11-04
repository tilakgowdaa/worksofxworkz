package com.xworkz.TaskOnEncapsulation;

public class Frames {
	public String material = "plastic";
	public char size = 'S';
	public boolean Quality = true;
	public int quantity = 5;
	public int price = 150;
	public String colour = "nickel";
	public String mountingType = "wall mount";
	public String shape = "rectangle";
	public double weight = 562;
	public String brand = "presto";
	public boolean damage = false;

	void setFrames(String material, char size, boolean quality, int quantity, int price, String colour,
			String mountingType, String shape, double weight, String brand, boolean damage) {
		this.material = material;
		this.size = size;
		Quality = quality;
		this.quantity = quantity;
		this.price = price;
		this.colour = colour;
		this.mountingType = mountingType;
		this.shape = shape;
		this.weight = weight;
		this.brand = brand;
		this.damage = damage;
	}

	public String getMaterial() {
		return material;
	}

	public char getSize() {
		return size;
	}

	public boolean isQuality() {
		return Quality;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public String getColour() {
		return colour;
	}

	public String getMountingType() {
		return mountingType;
	}

	public String getShape() {
		return shape;
	}

	public double getWeight() {
		return weight;
	}

	public String getBrand() {
		return brand;
	}

	public boolean isDamage() {
		return damage;
	}

}
