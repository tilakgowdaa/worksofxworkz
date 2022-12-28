package com.xworkz.Calendar;

import java.util.Collection;
import java.util.LinkedList;

public class CalendarRunner {

	public static void main(String[] args) {
		CalendarDTO calendarDTO=new CalendarDTO("Bangaluru Mudranalaya", 2023,6);
		CalendarDTO calendarDTO1=new CalendarDTO("Karnataka Bank", 2022,12);
		CalendarDTO calendarDTO2=new CalendarDTO("Krishna ", 2023,1);
		
		Collection<CalendarDTO> calendarDTOs=new LinkedList<CalendarDTO>();
		calendarDTOs.add(calendarDTO2);
		calendarDTOs.add(calendarDTO);
		calendarDTOs.add(calendarDTO1);
		
		boolean contain=calendarDTOs.contains(calendarDTO2);
		System.out.println(contain);
	}

}
