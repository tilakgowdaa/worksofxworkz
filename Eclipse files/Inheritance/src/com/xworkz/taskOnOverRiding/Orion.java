package com.xworkz.taskOnOverRiding;

public class Orion extends ShoppingMall {
	public String ownerName;

	public Orion() {
		super();
	}

	public Orion(String name, String address, boolean parkingAvailable,String ownerName) {
		super(name, address, parkingAvailable);
		this.ownerName=ownerName;
	}

	public void showOff() {
		
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.parkingAvailable);
		System.out.println(this.ownerName);
	}
}
