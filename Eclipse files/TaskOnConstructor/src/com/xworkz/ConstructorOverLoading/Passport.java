package com.xworkz.ConstructorOverLoading;

public class Passport {
	public long number;
	public String name;
	public String expDate;
	public String country;
	public String issueDate;
	public int noOfLeafs;

	public Passport() {
		System.out.println("Passport created");
	}

	public Passport(long number) {
		this.number = number;
	}

	public Passport(long number, String name) {
		this.number = number;
		this.name = name;
	}

	public Passport(long number, String name, String expDate) {
		this.number = number;
		this.name = name;
		this.expDate = expDate;
	}

	public Passport(long number, String name, String expDate, String country) {
		this.number = number;
		this.name = name;
		this.expDate = expDate;
		this.country = country;
	}

	public Passport(long number, String name, String expDate, String country, String issueDate) {
		this.number = number;
		this.name = name;
		this.expDate = expDate;
		this.country = country;
		this.issueDate = issueDate;
	}

	public Passport(String name) {
		this.name = name;
	}

	public Passport(String name, String country) {
		this.name = name;
		this.country = country;
	}

}
