package com.xworkz.taskOnOverRiding;

public class Prashanth extends Director {
	public String hitMovie;

	public Prashanth() {
		super();
	}

	public Prashanth(int noOfDirection, String currentProject, boolean hitDirector,String hitMovie) {
		super(noOfDirection, currentProject, hitDirector);
		this.hitMovie=hitMovie;
	}
	
	public void showOff() {
		System.out.println(this.noOfDirection);
		System.out.println(this.currentProject);
		System.out.println(this.hitDirector);
		System.out.println(this.hitMovie);
	}

}
