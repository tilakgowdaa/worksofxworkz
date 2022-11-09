package com.xworkz.taskOnOverRiding;

public class Bjp extends PoliticalPartyy {
	public int since;

	public Bjp() {
		super();
	}

	public Bjp(int seats, String highCommand, boolean isruling) {
		super(seats, highCommand, isruling);
	}
	
	public void showOff() {
		System.out.println(this.seats);
		System.out.println(this.highCommand);
		System.out.println(this.isruling);
		System.out.println(this.since);
	}

}

