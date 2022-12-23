package com.xworkz.collectionMethods;

import java.util.Collection;
import java.util.TreeSet;

public class Sweet {

	public static void main(String[] args) {
		String sweet1 = "Gulab jamun";
		String sweet2 = "Rasgulla";
		String sweet3 = "Kheer";
		String sweet4 = "Rasmalai";
		String sweet5 = "jalebi";
		String sweet6 = "<Mysore pak";
		String sweet7 = "Kaju katli";
		String sweet8 = "malpua";
		String sweet9 = "peda";
		String sweet10 = "Balushashi";
		String sweet11 = "Rabri";
		String sweet12 = "laddu";
		String sweet13 = "gavvalu";

		Collection<String> collection = new TreeSet();

		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());

	}
}
