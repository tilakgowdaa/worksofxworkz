package com.xworkz.associationOneToMany.boot;

import com.xworkz.associationOneToMany.*;

public class CountryRunner {

	public static void main(String[] args) {
		Country country = new Country("India", "Delhi", 3.243);
		
		President president = new President("Droupadi", 5);
		president.setGender(Gender.Female);

		if (president.getPresidentName() != null) {
			president.showOff();
		} else {
			System.out.println("President is null");
		}

		City city10 = new City("Karnataka", "Bangalore", "Bendakaluru", 322);
		City city20 = new City("Maharastra", "Mumbai", "Bombay", 256);

		City[] city = { city10, city20 };
		country.setCity(city);
		country.showOff();
        

	}
}