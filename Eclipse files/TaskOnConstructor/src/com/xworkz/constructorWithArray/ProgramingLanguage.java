package com.xworkz.constructorWithArray;

public class ProgramingLanguage {
	
	public String name;
	public String type;
	public String invented;
	public int types;
	public boolean freeToUse;
	public String[] placeNames;
	public String[] placeLocation;
	public String[] members;
	public double[] price;
	public long[] totalUserOtherCountry;
	public String[] countryNames;

	public ProgramingLanguage(String name, String type, String invented, int types, boolean freeToUse,String[] placeNames, String[] placeLocation, String[] members, double[] price, long[] totalUserOtherCountry,
			String[] countryNames)

	{
		this.name = name;
		this.type = type;
		this.invented = invented;
		this.types = types;
		this.freeToUse = freeToUse;
		this.placeNames = placeNames;
		this.placeLocation = placeLocation;
		this.members = members;
		this.price = price;
		;
		this.totalUserOtherCountry = totalUserOtherCountry;
		this.countryNames = countryNames;

	}

	public void display() {

		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.invented);
		System.out.println(this.types);
		System.out.println(this.freeToUse);

		for (int i = 0; i < placeNames.length; i++) {
			String ref1 = this.placeNames[i];
			System.out.println(ref1);
		}

		for (int i = 0; i < placeLocation.length; i++) {
			String ref2 = this.placeLocation[i];
			System.out.println(ref2);
		}

		for (int i = 0; i < members.length; i++) {
			String ref3 = this.members[i];
			System.out.println(ref3);
		}

		for (int i = 0; i < price.length; i++) {
			double ref4 = this.price[i];
			System.out.println(ref4);
		}

		for (int i = 0; i < totalUserOtherCountry.length; i++) {
			long ref5 = this.totalUserOtherCountry[i];
			System.out.println(ref5);
		}

		for (int i = 0; i < countryNames.length; i++) {
			String ref6 = this.countryNames[i];
			System.out.println(ref6);
		}

	}
}
