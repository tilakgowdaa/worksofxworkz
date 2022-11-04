package com.xworkz.TaskOnEncapsulation;

public class BagInsidePackage {

	public String otherBrand="lenovo";
	public Bag bag;

	public void use(Bag bag) {
		bag.setBag("Dell laptop bag", 12, "Dell", 3, 12, "Do no", false, 120, 140, "Black", false);

		System.out.println(otherBrand);
		System.out.println(bag.getName());
		System.out.println(bag.getSize());
		System.out.println(bag.getBrand());
		System.out.println(bag.getNoOfZip());
		System.out.println(bag.getCapacity());
		System.out.println(bag.getOwner());
		System.out.println(bag.isLock());
		System.out.println(bag.getLength());
		System.out.println(bag.getWidth());
		System.out.println(bag.getColor());
		System.out.println(bag.isHappy());

	}

}
