package com.xworkz.taskOnOverRiding;

public class Satellite {
	public String name;
	public int modelNo;
	public double speed;

	public Satellite() {
		super();
	}

	public Satellite(String name, int modelNo, double speed) {
		super();
		this.name = name;
		this.modelNo = modelNo;
		this.speed = speed;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.modelNo);
		System.out.println(this.speed);
	}

}
