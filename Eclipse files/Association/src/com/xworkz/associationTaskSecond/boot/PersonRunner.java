package com.xworkz.associationTaskSecond.boot;

import com.xworkz.associationTaskSecond.Address;
import com.xworkz.associationTaskSecond.City;
import com.xworkz.associationTaskSecond.Company;
import com.xworkz.associationTaskSecond.Country;
import com.xworkz.associationTaskSecond.Email;
import com.xworkz.associationTaskSecond.Job;
import com.xworkz.associationTaskSecond.Location;
import com.xworkz.associationTaskSecond.Person;
import com.xworkz.associationTaskSecond.State;

public class PersonRunner {

	public static void main(String[] args) {
		City city = new City("Bangalore", 12.4, "Garden City", 2231);
		city.showOff();
		System.out.println(System.lineSeparator());

		State state = new State("Karnataka", "Banglaore", 31, "BRB");
		state.showOff();
		System.out.println(System.lineSeparator());

		Country country = new Country("India", 30, 91, "Delhi");
		country.showOff();
		System.out.println(System.lineSeparator());

		Location location = new Location();
		location.setLocation(22, "Rajajinagar", city, state, country);
		location.showOff();
		System.out.println(System.lineSeparator());

		Address address = new Address();
		address.setAddress(location);
		address.showOff();
		System.out.println(System.lineSeparator());

		Company company = new Company();
		company.setCompany("infosis", "Narayan & others", address);
		company.showOff();
		System.out.println(System.lineSeparator());

		Job job = new Job();
		job.setJob(12345, "Software Developer", true, company);
		job.showOff();
		System.out.println(System.lineSeparator());
		
		Email email1 = new Email();
		email1.setEmail("Suresh123@gmail.com", "suresh123", 9372829913l, company);

		Email email2 = new Email();
		email2.setEmail("Sureshoffice123@gmail.com", "office123", 738290103l, company);

		Email[] email = { email1, email2 };
		
		Person person = new Person();
		
		person.setPerson("Suresh", email, job);
		person.showOff();
		

	}

}
