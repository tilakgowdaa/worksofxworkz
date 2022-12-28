package com.xworkz.Sanitizer;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class SanitizerRunner {

	public static void main(String[] args) {
		SanitizerDTO dto = new SanitizerDTO("ID9292", "LifeBuoy", 100D, "white");
		SanitizerDTO dto1 = new SanitizerDTO("ID6322", "Dettol", 200D, "red");
		SanitizerDTO dto2 = new SanitizerDTO("ID3522", "Steillium", 500D, "green");
		SanitizerDTO dto3 = new SanitizerDTO("ID7930", "Purell", 150D, "white");
		SanitizerDTO dto4 = new SanitizerDTO("ID9794", "BabyGanics", 250D, "pink");
		SanitizerDTO dto5 = new SanitizerDTO("ID8194", "Germ x", 170D, "blue");
		SanitizerDTO dto6 = new SanitizerDTO("ID9283", "Savlon", 220D, "blue");
		SanitizerDTO dto7 = new SanitizerDTO("ID4283", "Godrej", 1100D, "yellow");
		SanitizerDTO dto8 = new SanitizerDTO("ID2722", "Dabar", 125D, "pink");
		SanitizerDTO dto9 = new SanitizerDTO("ID3472", "multhani", 133D,null);

		Collection<SanitizerDTO> collection = new LinkedList<SanitizerDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);

		System.out.println(collection.size());
		System.out.println(System.lineSeparator());

		for (SanitizerDTO sanitizerDTO : collection) {
			if (sanitizerDTO.getPrice() > 5) {
				System.out.println("price above 5 : " + sanitizerDTO);
			}
		}
		System.out.println(System.lineSeparator());

		Iterator<SanitizerDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {
			SanitizerDTO element = iterator.next();
			if (element.getBrand() == null || element.getColor() == null || element.getId() == null
					|| element.getPrice() == 0) {
				System.out.println("Element is Null : " + element);
			}
		}

		System.out.println(System.lineSeparator());
		
		Iterator<SanitizerDTO> iterator1 = collection.iterator();
		while (iterator1.hasNext()) {
			SanitizerDTO element = iterator1.next();
			if ("green".equals(element.getColor()) || "red".equals(element.getColor())
					|| "blue".equals(element.getColor())) {
				System.out.println("removing : " + element);
				iterator1.remove();
			}
		}
		System.out.println(System.lineSeparator());
		System.out.println("Size After removing : " + collection.size());

	}
}
