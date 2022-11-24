package com.xworkz.equality;

public class Vehicle {
	private String type;
	private int noOfWheels;
	private int topSpeed;
	private String company;
	private String color;
	private String modelname;
	private String mftYear;
	private double price;
	private int seating;
	private boolean safety;

	public Vehicle() {
		super();
		System.out.println("Default is running");
	}

	public Vehicle(String type, int noOfWheels, int topSpeed, String company, String color, String modelname,
			String mftYear, double price, int seating, boolean safety) {
		super();
		this.type = type;
		this.noOfWheels = noOfWheels;
		this.topSpeed = topSpeed;
		this.company = company;
		this.color = color;
		this.modelname = modelname;
		this.mftYear = mftYear;
		this.price = price;
		this.seating = seating;
		this.safety = safety;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running");
		if (obj instanceof Vehicle) {
			System.out.println("obj is Vehicle");
			Vehicle cast=(Vehicle)obj;
			if(this.company.equals(cast.company) && this.color.equals(cast.color)) {
				System.out.println("are same");
				return true;
			}
			else {
				System.out.println("model is diff");
				return false;
			}
			
		} 
		else{
			System.out.println("obj is not Vehicle");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", noOfWheels=" + noOfWheels + ", topSpeed=" + topSpeed + ", company="
				+ company + ", color=" + color + ", modelname=" + modelname + ", mftYear=" + mftYear + ", price="
				+ price + ", seating=" + seating + ", safety=" + safety + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getMftYear() {
		return mftYear;
	}

	public void setMftYear(String mftYear) {
		this.mftYear = mftYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSeating() {
		return seating;
	}

	public void setSeating(int seating) {
		this.seating = seating;
	}

	public boolean isSafety() {
		return safety;
	}

	public void setSafety(boolean safety) {
		this.safety = safety;
	}

}
