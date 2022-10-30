package com.xworkz.associationOneToMany;

public class City {
	public String name;
	public String capital;
	public String oldName;
	public int population;
	
	public City(String name,String capital,String oldName,int population) {
		this.name=name;
		this.capital=capital;
		this.oldName=oldName;
		this.population=population;
	}
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.oldName);
		System.out.println(this.population);
	}
}
