package com.xworkz.taskOnOverRiding;

public class ShoppingMall {
	public String name;
	public String address;
	public boolean parkingAvailable;

	public ShoppingMall() {
		super();
	}

	public ShoppingMall(String name, String address, boolean parkingAvailable) {
		super();
		this.name = name;
		this.address = address;
		this.parkingAvailable = parkingAvailable;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.parkingAvailable);
	}

}
