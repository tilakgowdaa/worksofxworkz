package com.xworkz.lamda.Application.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.lamda.Application.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
		Collection<ApplicationDTO> collection = new LinkedList<ApplicationDTO>();
		collection.add(new ApplicationDTO("Instagram", 4.3, true, "Kevin systrom", 0));
		collection.add(new ApplicationDTO("Facebook", 11.7, true, "Mark zuckerberg", 0));
		collection.add(new ApplicationDTO("Adobe", 6.3, false, "John Warnock", 1999));
		collection.add(new ApplicationDTO("G Map", 3.2, true, "Google", 0));
		System.out.println("1nd condition");
		collection.stream().filter((dto) -> {
			return dto.isFree() && dto.getDevelopedBy().equals("Google");
		}).collect(Collectors.toList()).forEach(dto -> System.out.println(dto));
		System.out.println("2nd condition");
		collection.stream().filter(dto -> dto.getVersion() > 5).map(dto -> dto.getName()).collect(Collectors.toList())
				.forEach(name -> System.out.println(name));

	}

}
