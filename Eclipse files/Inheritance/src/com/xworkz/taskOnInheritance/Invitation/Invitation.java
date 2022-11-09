package com.xworkz.taskOnInheritance.Invitation;

public class Invitation {
	public String type;
	public int noOfCopies;
	public boolean colorPrint;

	public Invitation(String type, int noOfCopies, boolean colorPrint) {
		super();
		this.type = type;
		this.noOfCopies = noOfCopies;
		this.colorPrint = colorPrint;
	}

	public Invitation() {
		super();
	}

}
