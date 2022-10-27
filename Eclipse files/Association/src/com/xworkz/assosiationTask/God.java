package com.xworkz.assosiationTask;

public class God {
	public String name;
	public char gender;
	public String mainPower;
	public Weapon weapon = new Weapon("Pen", "write", 120.50);

	public God(String name, char gender, String mainPower) {
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.mainPower);
		System.out.println(weapon.name);
	}
}
