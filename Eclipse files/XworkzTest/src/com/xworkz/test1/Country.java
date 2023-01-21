package com.xworkz.test1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Country {
	public static void main(String[] args) {
		Map<String, Integer> map=new TreeMap<String, Integer>();
		map.put("India", 91);
		map.put("UK", 32);
		map.put("USA", 13);
		map.put("UAE", 42);
		map.put("China", 52);
		
		Set<Entry<String, Integer>> entry= map.entrySet();
		entry.forEach(ele->System.out.println(ele));
		
		map.forEach((key,value)->{if(value==52) {System.out.println(key);}});
			
		Iterator<Entry<String, Integer>> itr=entry.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> ent= itr.next();
			if(ent.getValue()==42) {
				itr.remove();
				for (Entry<String, Integer> entry2 : entry) {
					System.out.println(entry2);
				}
			}
		}
		
		
	}
}
