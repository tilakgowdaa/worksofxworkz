package com.xworkz.TaskOnEncapsulation;

public class GroceryInsidePackage {
	public String otherName="Om store";
	public Grocery grocery;

	public void use(Grocery grocery) {
		System.out.println(otherName);
		grocery.setGrocery("lakshmi store", "Manjunath nagar", 11, 6, 5, false, false, "okay okay", 4, false, 5.0);
		System.out.println(grocery.storeName);
		System.out.println(grocery.location);
		System.out.println(grocery.workers);
		System.out.println(grocery.maleWorkers);
		System.out.println(grocery.femaleWorkers);
		System.out.println(grocery.stock);
		System.out.println(grocery.homeDelivery);
		System.out.println(grocery.reviews);
		System.out.println(grocery.onlineOrder);
		System.out.println(grocery.discount);
	}

}
