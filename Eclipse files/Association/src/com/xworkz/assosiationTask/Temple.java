package com.xworkz.assosiationTask;

public class Temple {
	public String name;
	public God god = new God("Saraswathi", 'F', "Education");
	public String mainPriest;
	public int noOfVisistors;
	public int collectionPerday;

	public Temple(String name, String mainPriest, int noOfVisistors, int collectionPerday) {
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisistors = noOfVisistors;
		this.collectionPerday = collectionPerday;
	}
}
