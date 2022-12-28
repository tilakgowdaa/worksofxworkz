package com.xworkz.Airport;

import java.util.Collection;
import java.util.LinkedList;

public class AirportRunner {

	public static void main(String[] args) {
		AirportDTO airportDTO = new AirportDTO("Kempe Gowda International Airport", "Bangalore", 2);
		AirportDTO airportDTO1 = new AirportDTO("Chatrapathi Shivaji", "Mumbai", 2);
		AirportDTO airportDTO2 = new AirportDTO("Meenambakkam", "Chennai", 1);

		Collection<AirportDTO> airportDTOs = new LinkedList<AirportDTO>();
		airportDTOs.add(airportDTO);
		airportDTOs.add(airportDTO1);
		airportDTOs.add(airportDTO2);
		
		boolean contain=airportDTOs.contains(airportDTO1);
	}

}
