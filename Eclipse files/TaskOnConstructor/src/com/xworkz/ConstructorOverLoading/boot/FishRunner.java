package com.xworkz.ConstructorOverLoading.boot;

import com.xworkz.ConstructorOverLoading.Fish;

public class FishRunner {

	public static void main(String[] args) {
		Fish ref = new Fish();
		System.out.println(ref.name);

		Fish ref1 = new Fish("Anjal");
		System.out.println(ref1.name);

		Fish ref2 = new Fish(250d);
		System.out.println(ref2.price);

		Fish ref3 = new Fish(3);
		System.out.println(ref3.weight);

		Fish ref4 = new Fish(160f);
		System.out.println(ref4.length);

		Fish ref5 = new Fish("pampret", "sea fish");
		System.out.println(ref5.name + " " + ref5.type);

		Fish ref6 = new Fish("jalebi", 400);
		System.out.println(ref6.name + " " + ref6.price);

		Fish ref7 = new Fish(5, 180f);
		System.out.println(ref7.weight + " " + ref7.length);

	}

}
