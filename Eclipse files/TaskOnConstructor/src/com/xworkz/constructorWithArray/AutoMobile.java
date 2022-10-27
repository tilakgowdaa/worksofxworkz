package com.xworkz.constructorWithArray;

public class AutoMobile {
	public String name;
	public char type;
	public String bikes;
	public int noOfBikes;
	public boolean topEnd;
	public String[] bikeName;
	public String[] companyLocation;
	public String[] bikeLogo;
	public double[] price;
	public long[] totalVehicleManufactured;
	public String[] companyOwnersName;

	public AutoMobile(String name, char type, String bikes, int noOfBikes, boolean topEnd, String[] bikeName,
			String[] companyLocation, String[] bikeLogo, double[] price, long[] totalVehicleManufactured,
			String[] companyOwnersName) {
		this.name = name;
		this.type = type;
		this.bikes = bikes;
		this.noOfBikes = noOfBikes;
		this.topEnd = topEnd;
		this.bikeName = bikeName;
		this.companyLocation = companyLocation;
		this.bikeLogo = bikeLogo;
		this.price = price;
		this.totalVehicleManufactured = totalVehicleManufactured;
		this.companyOwnersName = companyOwnersName;
	}

	public void displayDetails() {
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.bikes);
		System.out.println(this.noOfBikes);
		System.out.println(this.topEnd);

		System.out.println(System.lineSeparator());

		for (int i = 0; i < this.bikeName.length; i++) {
			String ref = this.bikeName[i];
			System.out.println("bike name : " + ref);
		}
		
		for (int i = 0; i < this.companyLocation.length; i++) {
			String ref1 = this.companyLocation[i];
			System.out.println("companyLocation : " + ref1);
		}
		
		for (int i = 0; i < this.bikeLogo.length; i++) {
			String ref2 = this.bikeLogo[i];
			System.out.println("bikeLogo : " + ref2);
		}
		
		for (int i = 0; i < this.price.length; i++) {
			double ref3 = this.price[i];
			System.out.println("price : " + ref3);
		}
		
		for (int i = 0; i < this.totalVehicleManufactured.length; i++) {
			long ref = this.totalVehicleManufactured[i];
			System.out.println("totalVehicleManufactured : " + ref);
		}
		
		for (int i = 0; i < this.companyOwnersName.length; i++) {
			String ref = this.companyOwnersName[i];
			System.out.println("companyOwnersName : " + ref);
		}

	}
}
