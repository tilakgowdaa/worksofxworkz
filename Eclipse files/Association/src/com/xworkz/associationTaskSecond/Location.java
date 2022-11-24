package com.xworkz.associationTaskSecond;

public class Location {
	public int no;
	public String street;
	public City city;
	public State state;
	public Country country;

	public void setLocation(int no, String street,City city,State state,Country country) {
		this.no = no;
		this.street = street;
		this.city=city;
		this.state=state;
		this.country=country;
	}

	public void showOff() {
		System.out.println(this.no);
		System.out.println(this.street);
		if(city!=null && state!=null && country!=null) {
		city.showOff();
		state.showOff();
		country.showOff();
		}
	}

}
