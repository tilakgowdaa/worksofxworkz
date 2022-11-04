package com.xworkz.TaskOnEncapsulation;

public class ToothpasteInsidePackage {
	public int newPrice;
	public Toothpaste toothpaste;

	public void use(Toothpaste toothpaste) {
		System.out.println(newPrice);
		toothpaste.setToothpaste("Colgate", "red", 50.0, 'M', 50, "salt", "Colgate", "10/2/2040", "10/2/2045", "Truck",
				true);
		System.out.println(toothpaste.name);
		System.out.println(toothpaste.color);
		System.out.println(toothpaste.price);
		System.out.println(toothpaste.size);
		System.out.println(toothpaste.weight);
		System.out.println(toothpaste.flavour);
		System.out.println(toothpaste.company);
		System.out.println(toothpaste.mftDate);
		System.out.println(toothpaste.expDate);
		System.out.println(toothpaste.transport);
		System.out.println(toothpaste.available);
	}
}
