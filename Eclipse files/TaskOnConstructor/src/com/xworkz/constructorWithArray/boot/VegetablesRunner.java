package com.xworkz.constructorWithArray.boot;

import com.xworkz.constructorWithArray.*;

public class VegetablesRunner {

	public static void main(String[] args) {
		String[] name = { "tomato", "beans", "potato", "brinjal" };
		String[] roundVeg = { "tomato", "potato", "pumpkin", "onion" };
		String[] LongVeg = { "frenchBean", "bitterGourd", "carrot", "cucumber" };
		String[] color = { "red", "orange", "green", "purple" };
		String[] taste = { "sweet", "bitter", "sour", "normal" };
		String[] cost = { "45rs", "55rs", "66rs" };

		Vegetables vegetable = new Vegetables(name, true, roundVeg, LongVeg, 8, 5, color, taste, cost, false);
		vegetable.displayDetails();

	}

}
