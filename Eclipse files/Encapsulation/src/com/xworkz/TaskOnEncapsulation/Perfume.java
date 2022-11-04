package com.xworkz.TaskOnEncapsulation;

public class Perfume {

	public String brand = "zara";
	public String name = "bloom";
	public String brandOwner = "Ortega";
	public String manufactureCountry = "spain";
	public double price = 1250;
	public String manufactureDate = "2016-10-05";
	public String expiryDate = "2020-11-20";
	public boolean quality = true;
	public int quantity = 2;
	public String fragrance = "mild";
	public String colour = "pink";

	void setPerfume(String brand, String name, String brandOwner, String manufactureCountry, double price,
			String manufactureDate, String expiryDate, boolean quality, int quantity, String fragrance, String colour) {
		this.brand = brand;
		this.name = name;
		this.brandOwner = brandOwner;
		this.manufactureCountry = manufactureCountry;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.quality = quality;
		this.quantity = quantity;
		this.fragrance = fragrance;
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public String getBrandOwner() {
		return brandOwner;
	}

	public String getManufactureCountry() {
		return manufactureCountry;
	}

	public double getPrice() {
		return price;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public boolean isQuality() {
		return quality;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getFragrance() {
		return fragrance;
	}

	public String getColour() {
		return colour;
	}

}
