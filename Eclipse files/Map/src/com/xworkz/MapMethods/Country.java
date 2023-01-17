package com.xworkz.MapMethods;

import java.util.Map;
import java.util.TreeMap;

public class Country {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("India", "Droupadi Murmu ");
		map.put("China", "Xi Jinping");
		map.put("Kazakhstan", "Qasym");
		map.put("Saudi Arabia", "Salman");
		map.put("Iran", "Hassan Rouhani");
		map.put("Mongolia ", "Khaltmaagiin Battulga");
		map.put("Indonesia", "Joko Widodo");
		map.put("Pakistan ", "Arif Alvi");
		map.put("Turkey", "Recep Tayyip Erdogan");
		map.put("Myanmar", "Myint Swe");
		map.put("Afghanistan", "Mohammad Hassan Akhund");
		map.put("Yemen", " Abdrabbuh Mansur Hadi");
		map.put("Thailand", " Maha Vajiralongkorn");
		map.put("Turkmenistan ", "Gurbanguly Berdimuhamedow");
		map.put("Uzbekistan", "Shavkat Mirziyoyev");
		map.put("Iraq ", " Barham Salih");
		map.put("Japan", "Naruhito");
		map.put("Vietnam", " Nguyen");
		map.put("Malaysia", "Abdullah Sultan");
		map.put("Oman", "Sultan");

		System.out.println(map.size());
		map.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		System.out.println("After replace");
		map.forEach((key, value) -> {

			if (key.length() > 10) {
				map.replace(key, "mee");
				System.out.println(key + " : " + value);
			}
		});

	}
}
