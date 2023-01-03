package com.xworkz.lamda.Palace.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.lamda.Palace.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {
		Collection<PalaceDTO> collection = new LinkedList<PalaceDTO>();
		collection.add(new PalaceDTO("Mysore", "Mysore", 1890, false, 1000));
		collection.add(new PalaceDTO("Bangalore", "Bengaluru", 1920, true, 100));
		collection.add(new PalaceDTO("Shivappa nayaka", "Shimoga", 1940, false, 150));

		collection.stream().filter(dto -> !dto.isDestroyed()).collect(Collectors.toSet())
				.forEach(dto -> System.out.println(dto));

	}

}
