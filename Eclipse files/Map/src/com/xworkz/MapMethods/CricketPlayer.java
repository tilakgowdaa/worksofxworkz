package com.xworkz.MapMethods;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CricketPlayer {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<String, Integer>((a1, a2) -> a2.compareTo(a1));
		map.put("Sachin", 34357);
		map.put("Kohli", 24715);
		map.put("Dravid", 24064);
		map.put("KL Rahul", 6353);
		map.put("Dhoni", 17092);

		System.out.println("Sort in decending");
		Set<Entry<String, Integer>> entry = map.entrySet();
		entry.forEach(ele -> System.out.println(ele));
		
		System.out.println("Remove if run less than 10000");
		
		//map.forEach((key,value)->{if(value<10000) {map.remove(key);}});
	}
}
