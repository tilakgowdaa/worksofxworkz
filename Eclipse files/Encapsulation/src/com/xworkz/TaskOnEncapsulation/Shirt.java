package com.xworkz.TaskOnEncapsulation;

public class Shirt {
	public String color = "Blue";
	public String brand = "US Polo";
	public char size = 'M';
	public int noOfButton = 5;
	public int sizeInNo = 40;
	public boolean looksGood = true;
	public boolean lightColor = true;
	public double price = 1500;
	public boolean fullSleeve = false;
	public boolean halfSleeve = true;
	public boolean sleeveless = false;

	public void setShirt(String color, String brand, char size, int noOfButton, int sizeInNo, boolean looksGood,
			boolean lightColor, double price, boolean fullSleeve, boolean halfSleeve, boolean sleeveless) {
		this.color = color;
		this.brand = brand;
		this.size = size;
		this.noOfButton = noOfButton;
		this.sizeInNo = sizeInNo;
		this.looksGood = looksGood;
		this.lightColor = lightColor;
		this.price = price;
		this.fullSleeve = fullSleeve;
		this.halfSleeve = halfSleeve;
		this.sleeveless = sleeveless;
	}

	public String getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}

	public char getSize() {
		return size;
	}

	public int getNoOfButton() {
		return noOfButton;
	}

	public int getSizeInNo() {
		return sizeInNo;
	}

	public boolean isLooksGood() {
		return looksGood;
	}

	public boolean isLightColor() {
		return lightColor;
	}

	public double getPrice() {
		return price;
	}

	public boolean isFullSleeve() {
		return fullSleeve;
	}

	public boolean isHalfSleeve() {
		return halfSleeve;
	}

	public boolean isSleeveless() {
		return sleeveless;
	}

}
