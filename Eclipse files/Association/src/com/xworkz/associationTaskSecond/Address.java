package com.xworkz.associationTaskSecond;

public class Address {
	public Location location;

	public void setAddress(Location location) {
		this.location = location;
	}

	public void showOff() {
		if(location!=null) {
			location.showOff();
		}
	}
}
