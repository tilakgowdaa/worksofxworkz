package com.xworkz.TaskOnEncapsulation;

public class Medicine {
	public String name="nicip";
	public double price=3;
	public String inKannada="thale novina matre";
	public String combination="water";
	public String company="cipla";
	public double priceForSheet=30.0;
	public boolean availability=true;
	public String mftDate="12/11/2019";
	public String expDate="21/5/2020";
	public boolean forChildren=false;
	public int rating=4;

	void setMedicine(String name, double price, String inKannada, String combination, String company,
			double priceForSheet, boolean availability, String mftDate, String expDate, boolean forChildren,
			int rating) {
		this.name = name;
		this.price = price;
		this.inKannada = inKannada;
		this.combination = combination;
		this.company = company;
		this.priceForSheet = priceForSheet;
		this.availability = availability;
		this.mftDate = mftDate;
		this.expDate = expDate;
		this.forChildren = forChildren;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getInKannada() {
		return inKannada;
	}

	public String getCombination() {
		return combination;
	}

	public String getCompany() {
		return company;
	}

	public double getPriceForSheet() {
		return priceForSheet;
	}

	public boolean isAvailability() {
		return availability;
	}

	public String getMftDate() {
		return mftDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public boolean isForChildren() {
		return forChildren;
	}

	public int getRating() {
		return rating;
	}

}
