package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Company {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("Microsoft", "MS_office");
		map.put("Software_heros", "java");
		map.put("Wipro", "java_1.8");
		map.put("Infosys", "c");
		map.put("Harman", "PHP");
		map.put("IBM", "IDE");
		map.put("TCS", "C++");
		map.put("Oracle", "java_11");
		map.put("SAP", "Cloud");
		map.put("DXC", "Sql");
		
		System.out.println(map.size());
		
		boolean ref=map.isEmpty();
		System.out.println(ref);
		
		Set<String> keys=map.keySet();
		keys.forEach(ele->System.out.println(ele));
		
		Collection<String> values=map.values();
		values.forEach(ele->System.out.println(ele));
		
		Set<Entry<String, String>> pair=map.entrySet();
		pair.forEach(ele->System.out.println(ele));
	}

}
