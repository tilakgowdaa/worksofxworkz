package com.xworkz.associationOneToMany;

public class Country {
	public String name;
	public String capital;
	public President president;
	public double area;
	public City[] city;

	public Country(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	public Country(President president) {
		this.president = president;
	}

	public void setCity(City[] city) {
		this.city = city;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.area);

			if(city!=null) {
				for(int i=0;i<0;i++) {
					City cities=city[i];
					if(cities!=null) {
						cities.showOff();
					}
				}
			}
	}

}
