package com.xworkz.Enum;

public class Biscuit {
	public String company;
	public String location;
	public int builtYear;
	public EnumClass products;
	public EnumClass no = EnumClass.goodDay;

	public Biscuit(String company, String location, int builtYear) {
		this.company = company;
		this.location = location;
		this.builtYear = builtYear;
	}

	public void display() {
		System.out.println(this.company);
		System.out.println(this.location);
		System.out.println(this.builtYear);
		System.out.println(no);
		System.out.println(products);
		
		/*
		 * for (int i = 0; i < products.length; i++) { System.out.println(products[i]);
		 * }
		 */

	}
}
