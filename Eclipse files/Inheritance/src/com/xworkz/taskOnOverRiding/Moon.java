package com.xworkz.taskOnOverRiding;

public class Moon extends Satellite {
	public boolean isSatellite;

	public Moon() {
		super();
	}

	public Moon(String name, int modelNo, double speed, boolean isSatellite) {
		super(name, modelNo, speed);
		this.isSatellite = isSatellite;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.modelNo);
		System.out.println(this.speed);
		System.out.println(this.isSatellite);
	}

}
