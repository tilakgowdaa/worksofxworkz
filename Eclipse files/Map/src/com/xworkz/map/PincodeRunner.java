package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PincodeRunner {

	public static void main(String[] args) {
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(577201L, "Basavangudi_shimoga");
		map.put(560090L, "Bengaluru_North");
		map.put(560010L, "Rajajinagar_bang");
		map.put(560055L, "Malleshwaram");
		map.put(560060L, "Banglore_rural");
		map.put(590001L, "Belgaum");
		map.put(583101L, "Bellary");
		map.put(585226L, "Bidar");
		map.put(577501L, "Chitradurga");
		map.put(577001L, "Davangere");

		System.out.println(map.size());

		boolean ref = map.isEmpty();
		System.out.println(ref);

		Set<Long> keys = map.keySet();
		keys.forEach(ele -> System.out.println(ele));

		Collection<String> values = map.values();
		values.forEach(ele -> System.out.println(ele));

		Set<Entry<Long, String>> pair = map.entrySet();
		pair.forEach(ele -> System.out.println(ele));
	}

}
