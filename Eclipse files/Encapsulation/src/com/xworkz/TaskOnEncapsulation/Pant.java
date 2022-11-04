package com.xworkz.TaskOnEncapsulation;

public class Pant {
	public String brand="allen solly";
	public int size=34;
	public char sizeInChar='L';
	public double length=160;
	public boolean looksGood=true;
	public String color="Blue";
	public int noOfButton=3;
	public boolean malePant=true;
	public boolean femalePant=false;
	public String clothType="cotton";
	public int noOfPockets=6;

	void setPant(String brand, int size, char sizeInChar, double length, boolean looksGood, String color,
			int noOfButton, boolean malePant, boolean femalePant, String clothType, int noOfPockets) {
		this.brand = brand;
		this.size = size;
		this.sizeInChar = sizeInChar;
		this.length = length;
		this.looksGood = looksGood;
		this.color = color;
		this.noOfButton = noOfButton;
		this.malePant = malePant;
		this.femalePant = femalePant;
		this.clothType = clothType;
		this.noOfPockets = noOfPockets;
	}

	public String getBrand() {
		return brand;
	}

	public int getSize() {
		return size;
	}

	public char getSizeInChar() {
		return sizeInChar;
	}

	public double getLength() {
		return length;
	}

	public boolean isLooksGood() {
		return looksGood;
	}

	public String getColor() {
		return color;
	}

	public int getNoOfButton() {
		return noOfButton;
	}

	public boolean isMalePant() {
		return malePant;
	}

	public boolean isFemalePant() {
		return femalePant;
	}

	public String getClothType() {
		return clothType;
	}

	public int getNoOfPockets() {
		return noOfPockets;
	}

}
