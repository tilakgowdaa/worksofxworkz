package com.xworkz.associationTaskSecond;

public class Country {
	public String name;
	public int noOfStates;
	public int countryCode;
	public String capital;

	public Country(String name, int noOfStates, int countryCode, String capital) {
		this.name = name;
		this.noOfStates = noOfStates;
		this.countryCode = countryCode;
		this.capital = capital;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.noOfStates);
		System.out.println(this.countryCode);
		System.out.println(this.capital);
	}

}
