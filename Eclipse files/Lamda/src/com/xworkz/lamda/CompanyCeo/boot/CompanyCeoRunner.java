package com.xworkz.lamda.CompanyCeo.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.lamda.CompanyCeo.CompanyCeoDTO;
import com.xworkz.lamda.CompanyCeo.DaughterDTO;

public class CompanyCeoRunner {

	public static void main(String[] args) {

		Collection<CompanyCeoDTO> collection = new LinkedList<CompanyCeoDTO>();
		collection.add(new CompanyCeoDTO("Amithab", "Asian ", 70, "India", "B E", true,
				new DaughterDTO("Ramya", 95737467543L, 28, false, true)));
		collection.add(new CompanyCeoDTO("Bachhan", "Nippon ", 46, "India", "B Tech", false,
				new DaughterDTO("Rakshitha", 89737467543L, 25, true, false)));
		collection.add(new CompanyCeoDTO("Abhishek", "Apex ", 36, "India", "B A", true,
				new DaughterDTO("Radhika", 75737467543L, 24, false, true)));

		System.out.println("1st condition");
		collection.stream().map(dto -> dto.getDaughterdto()).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto));
		System.out.println("2nd condition");
		collection.stream().map(dto -> dto.getDaughterdto().getName()).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto));
		System.out.println("3nd condition");
		collection.stream().filter(dto -> dto.getAge() > 30).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto));
		System.out.println("4nd condition");
		collection.stream().map(dto -> dto.getAge()).collect(Collectors.toList())
				.forEach(dto -> System.out.println("Father age : " + dto));
		;
		collection.stream().map(dto -> dto.getDaughterdto().getAge()).collect(Collectors.toList())
				.forEach(dto -> System.out.println("Daughter Age : " + dto));

	}

}
