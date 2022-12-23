package com.xworkz.collectionMethods.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Bike {
	public static void main(String[] args) {
		String bike1 = "MT 15";
		String bike2 = "royal enfield classic";
		String bike3 = "R E hunter";
		String bike4 = "Splendor";
		String bike5 = "R15";
		String bike6 = "Raider";
		String bike7 = "Apache";
		String bike8 = "R E bullet";
		String bike9 = "ola s1";
		String bike10 = "access 125";
		String bike11 = "N torq";
		String bike12 = "ather 450";
		String bike13 = "ninja";
		String bike14 = "pulsar";
		String bike15 = "duke";
		String bike16 = " apache RTR";
		String bike17 = "Chetak";
		String bike18 = "Activa";

		Collection<String> collection = new TreeSet();
		collection.add(bike1);
		collection.add(bike2);
		collection.add(bike3);
		collection.add(bike4);
		collection.add(bike5);
		collection.add(bike6);
		collection.add(bike7);
		collection.add(bike8);
		collection.add(bike9);
		collection.add(bike10);
		collection.add(bike11);
		collection.add(bike12);
		collection.add(bike13);
		collection.add(bike14);
		collection.add(bike15);
		collection.add(bike16);
		collection.add(bike17);
		collection.add(bike18);

		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());

	}
}
