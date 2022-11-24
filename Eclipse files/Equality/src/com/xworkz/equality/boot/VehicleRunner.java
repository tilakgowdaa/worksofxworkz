package com.xworkz.equality.boot;

import com.xworkz.equality.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setType("bike");
		vehicle.setNoOfWheels(2);
		vehicle.setTopSpeed(150);
		vehicle.setCompany("Bajaj");
		vehicle.setColor("black");
		vehicle.setMftYear("2022");
		vehicle.setModelname("Dominar");
		vehicle.setPrice(300000);
		vehicle.setSeating(2);
		vehicle.setSafety(true);

		Vehicle vehicle2 = new Vehicle("Car", 4, 180, "Skoda", "White", "Superb", "2020", 4000000, 5, true);
		System.out.println(vehicle2);
		
		boolean same=vehicle.equals(vehicle2);
		System.out.println(same);
	}

}
