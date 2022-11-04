package com.xworkz.TaskOnEncapsulation;

public class ShirtInsidePackage {

	public String otherColor = "white";
	public Shirt shirt;

	public void use(Shirt shirt) {

		shirt.setShirt("black", "Allen Solly", 'L', 6, 32, true, false, 1999.9, true, false, false);

		System.out.println(otherColor);
		System.out.println(shirt.color);
		System.out.println(shirt.brand);
		System.out.println(shirt.size);
		System.out.println(shirt.noOfButton);
		System.out.println(shirt.sizeInNo);
		System.out.println(shirt.looksGood);
		System.out.println(shirt.lightColor);
		System.out.println(shirt.price);
		System.out.println(shirt.fullSleeve);
		System.out.println(shirt.halfSleeve);
		System.out.println(shirt.sleeveless);

	}

}
