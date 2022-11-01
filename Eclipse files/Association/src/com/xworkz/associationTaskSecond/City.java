package com.xworkz.associationTaskSecond;

public class City {
	public String name;
	public double population;
	public String otherName;
	public int areaMillionsq;

	public City(String name, double population, String otherName, int areaMillionsq) {
		this.name = name;
		this.population = population;
		this.otherName = otherName;
		this.areaMillionsq = areaMillionsq;
	}

		public void showOff() {
			System.out.println(this.name);
			System.out.println(this.population);
			System.out.println(this.otherName);
			System.out.println(this.areaMillionsq);
		}
}
