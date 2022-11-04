package com.xworkz.TaskOnEncapsulation.boot;

import com.xworkz.TaskOnEncapsulation.Grocery;
import com.xworkz.TaskOnEncapsulation.GroceryInsidePackage;

public class GroceryRunner {

	public static void main(String[] args) {
		Grocery grocery=new Grocery();
		GroceryInsidePackage groc=new GroceryInsidePackage();
		groc.use(grocery);
		System.out.println(grocery.getReviews());
	}

}
