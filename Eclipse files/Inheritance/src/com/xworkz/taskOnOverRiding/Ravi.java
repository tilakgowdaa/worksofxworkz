package com.xworkz.taskOnOverRiding;

public class Ravi extends Criminal {
	public int height;

	public Ravi() {
		super();
	}

	public Ravi(String offense, int experiance, boolean punished,int height) {
		super(offense, experiance, punished);
		this.height=height;
	}
	
	public void showOff() {
		System.out.println(this.offense);
		System.out.println(this.experiance);
		System.out.println(this.punished);
		System.out.println(this.height);
	}

}
