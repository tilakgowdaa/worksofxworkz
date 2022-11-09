package com.xworkz.taskOnOverRiding;

public class PoliticalPartyy {
	public int seats;
	public String highCommand;
	public boolean isruling;

	public PoliticalPartyy() {
		super();
	}

	public PoliticalPartyy(int seats, String highCommand, boolean isruling) {
		super();
		this.seats = seats;
		this.highCommand = highCommand;
		this.isruling = isruling;
	}

	public void showOff() {
		System.out.println(this.seats);
		System.out.println(this.highCommand);
		System.out.println(this.isruling);
	}

}
