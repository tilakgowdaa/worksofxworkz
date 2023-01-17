package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChocolateRunner {

	public static void main(String[] args) {
		Map<String, Double> map=new HashMap<String, Double>();
		map.put("DairyMilk", 100D);
		map.put("Silk", 120D);
		map.put("5_Star", 10D);
		map.put("Munch", 10D);
		map.put("Kaccha_Mango", 50D);
		map.put("Snickers", 15D);
		map.put("Milky_bar", 12D);
		map.put("Kit_kat", 20D);
		map.put("Chokki-Chokki", 20D);
		map.put("Gone_mad", 10D);
		
		System.out.println(map.size());
		
		boolean ref=map.isEmpty();
		System.out.println(ref);
		
		Set<String> keys=map.keySet();
		keys.forEach(ele->System.out.println(ele));
		
		Collection<Double> values=map.values();
		values.forEach(ele->System.out.println(ele));
		
		Set<Entry<String, Double>> pair=map.entrySet();
		pair.forEach(ele->System.out.println(ele));
		
	}

}
