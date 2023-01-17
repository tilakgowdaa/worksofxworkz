package com.xworkz.MapMethods;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mobile {
	public static void main(String[] args) {
		Map<String, Double> map = new TreeMap<String, Double>((a1, a2) -> a2.compareTo(a1));
		map.put("vivo", 12000d);
		map.put("oppo", 13000d);
		map.put("iphone", 82000d);
		map.put("mi", 15000d);
		map.put("samsung", 30000d);
		map.put("realme", 20000d);
		map.put("poco", 14000d);
		map.put("nokia", 9000d);
		map.put("micromax", 8000d);
		map.put("oneplus", 35000d);

		System.out.println("Sort in Descending");
		Set<Entry<String, Double>> entry = map.entrySet();
		entry.forEach(ele -> System.out.println(ele));

		System.out.println(System.lineSeparator());

		System.out.println("Upper Case");
		map.forEach((key, value) -> System.out.println(key.toUpperCase() + " : " + value));

		System.out.println(System.lineSeparator());

		System.out.println("Price greater than 10000");
		map.forEach((key, value) -> {
			if (value > 10000) {
				System.out.println(key + ":" + value);
			}
		});
		
		System.out.println(System.lineSeparator());

		System.out.println("key char less than 5");
		map.forEach((key, value) -> {
			if (key.length() < 5) {
				System.out.println(key + ":" + value);
			}
		});

	}
}
