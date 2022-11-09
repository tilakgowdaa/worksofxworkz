package com.xworkz.taskOnOverRiding;

public class Criminal {
	public String offense;
	public int experiance;
	public boolean punished;

	public Criminal() {
		super();
	}

	public Criminal(String offense, int experiance, boolean punished) {
		super();
		this.offense = offense;
		this.experiance = experiance;
		this.punished = punished;
	}
	
	public void showOff() {
		System.out.println(this.offense);
		System.out.println(this.experiance);
		System.out.println(this.punished);
	}
}
