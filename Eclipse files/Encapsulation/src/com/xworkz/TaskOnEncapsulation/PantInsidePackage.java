package com.xworkz.TaskOnEncapsulation;

public class PantInsidePackage {
	public String otherBrand="Levi's";
	public Pant pant;
	
	public void use(Pant pant) {
		System.out.println(otherBrand);
		pant.setPant("pepe", 32, 'M', 150, false, "Black", 2, true, false, "Jeans", 4);
		System.out.println(pant.brand);
		System.out.println(pant.size);
		System.out.println(pant.sizeInChar);
		System.out.println(pant.length);
		System.out.println(pant.looksGood);
		System.out.println(pant.color);
		System.out.println(pant.noOfButton);
		System.out.println(pant.malePant);
		System.out.println(pant.clothType);
		System.out.println(pant.getNoOfPockets());
		
	}
}
