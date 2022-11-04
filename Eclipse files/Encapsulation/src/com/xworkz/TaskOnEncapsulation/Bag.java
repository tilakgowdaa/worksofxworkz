package com.xworkz.TaskOnEncapsulation;

public class Bag {
	public String name="HP laptop bag";
	public int size=15;
	public String brand="HP";
	public int noOfZip=1;
	public int capacity=15;
	public String owner="innu gottilla";
	public boolean lock=true;
	public int length=160;
	public int width=120;
	public String color="brown";
	public boolean happy=true;

	void setBag(String name, int size, String brand, int noOfZip, int capacity, String owner, boolean lock,
			int length, int width, String color, boolean happy) {
		this.name = name;
		this.size = size;
		this.brand = brand;
		this.noOfZip = noOfZip;
		this.capacity = capacity;
		this.owner = owner;
		this.lock = lock;
		this.length = length;
		this.width = width;
		this.color = color;
		this.happy = happy;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public String getBrand() {
		return brand;
	}

	public int getNoOfZip() {
		return noOfZip;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getOwner() {
		return owner;
	}

	public boolean isLock() {
		return lock;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public String getColor() {
		return color;
	}

	public boolean isHappy() {
		return happy;
	}

}
