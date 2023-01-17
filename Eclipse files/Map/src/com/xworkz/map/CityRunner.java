package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CityRunner {

	public static void main(String[] args) {
		Map<String, Double> map=new HashMap<String, Double>();
		map.put("Shivamogga", 28.1);
		map.put("Yadgir", 38.2);
		map.put("Bengaluru", 22.6);
		map.put("Hassan", 27.1);
		map.put("Jammu&kashmir",- 25.1);
		map.put("Rajasthan", 45.1);
		map.put("Kadur", 24.3);
		map.put("Birur",25.2);
		map.put("Bhadravathi", 24.1);
		map.put("Belagavi", 31.1);
		
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
