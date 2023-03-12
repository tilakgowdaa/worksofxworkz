package com.xworkz.collectionMethods.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Coupon {
	public static void main(String[] args) {
		String coupon1 = "jwiff";
		String coupon2 = "o2ejo";
		String coupon3 = "nnsla";
		String coupon4 = "mooawo";
		String coupon5 = "mofwqm";
		String coupon6 = "mofwa";
		String coupon7 = "mhokz";
		String coupon8 = "hue";
		String coupon9 = "ghioa";
		String coupon10 = "jrwj";
		String coupon11 = "oawj";
		String coupon12 = "hujos";

		Collection<String> collection = new TreeSet();
		collection.add(coupon1);
		collection.add(coupon2);
		collection.add(coupon3);
		collection.add(coupon4);
		collection.add(coupon5);
		collection.add(coupon6);
		collection.add(coupon7);
		collection.add(coupon8);
		collection.add(coupon9);
		collection.add(coupon10);
		collection.add(coupon11);
		collection.add(coupon12);
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());
		
		
	}
	
	
	

}
