package com.xworkz.Holiday;

import java.util.Collection;
import java.util.LinkedList;

public class HolidayRunner {

	public static void main(String[] args) {
		HolidayDTO dto = new HolidayDTO("Christams", 2, "25/12/2022");
		HolidayDTO dto1 = new HolidayDTO("Republic Day", 1, "26/01/2023");
		HolidayDTO dto2 = new HolidayDTO("Independence Day", 1, "15/08/2023");

		Collection<HolidayDTO> collection = new LinkedList<HolidayDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);

		boolean contain = collection.contains(dto);
		System.out.println(contain);
	}

}
