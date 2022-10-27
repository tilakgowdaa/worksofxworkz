package com.xworkz.assosiationTask;

public class Mountain {
	public String name;
	public Location location = Location.Tibet;
	public int height;
	public Temple temple = new Temple("Ganesha", "om", 266371, 287362);

	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.height);
		System.out.println(location);
		System.out.println(temple.mainPriest);
	}
}
