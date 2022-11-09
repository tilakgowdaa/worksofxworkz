package com.xworkz.taskOnOverRiding;

public class Director {
	public int noOfDirection;
	public String currentProject;
	public boolean hitDirector;

	public Director() {
		super();
	}

	public Director(int noOfDirection, String currentProject, boolean hitDirector) {
		super();
		this.noOfDirection = noOfDirection;
		this.currentProject = currentProject;
		this.hitDirector = hitDirector;
	}
	
	public void showOff() {
		System.out.println(this.noOfDirection);
		System.out.println(this.currentProject);
		System.out.println(this.hitDirector);
	}

}
