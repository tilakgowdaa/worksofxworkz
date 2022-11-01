package com.xworkz.associationTaskSecond;

public class State {
	public String name;
	public String capital;
	public int noOfdistrict;
	public String chiefMinister;

	public State(String name, String capital, int noOfdistrict, String chiefMinister) {
		this.name = name;
		this.capital = capital;
		this.noOfdistrict = noOfdistrict;
		this.chiefMinister = chiefMinister;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.noOfdistrict);
		System.out.println(this.chiefMinister);
	}

}
