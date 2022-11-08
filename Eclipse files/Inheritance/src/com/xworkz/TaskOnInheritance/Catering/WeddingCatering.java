package com.xworkz.TaskOnInheritance.Catering;

public class WeddingCatering extends Catering {

	public WeddingCatering() {
		super();
		System.out.println("WeddingCatering default is running ");
	}

	public WeddingCatering(String name, int inOfWorkers, boolean tastesGood) {
		super(name, inOfWorkers, tastesGood);
	}

}
