package com.xworkz.equality;

public class Currency {
	private String type;
	private double makingCost;
	private char code;
	private int totalCurrancy;
	private boolean strong;
	private String countryName;
	private double convertingPrice;
	private String material;
	private int validity;
	private String acceptableCountries;

	public Currency() {
		super();
	}

	public Currency(String type, double makingCost, char code, int totalCurrancy, boolean strong, String countryName,
			double convertingPrice, String material, int validity, String acceptableCountries) {
		super();
		this.type = type;
		this.makingCost = makingCost;
		this.code = code;
		this.totalCurrancy = totalCurrancy;
		this.strong = strong;
		this.countryName = countryName;
		this.convertingPrice = convertingPrice;
		this.material = material;
		this.validity = validity;
		this.acceptableCountries = acceptableCountries;
	}

	@Override
	public String toString() {
		return "Currency [type=" + type + ", makingCost=" + makingCost + ", code=" + code + ", totalCurrancy="
				+ totalCurrancy + ", strong=" + strong + ", countryName=" + countryName + ", convertingPrice="
				+ convertingPrice + ", material=" + material + ", validity=" + validity + ", acceptableCountries="
				+ acceptableCountries + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getMakingCost() {
		return makingCost;
	}

	public void setMakingCost(double makingCost) {
		this.makingCost = makingCost;
	}

	public char getCode() {
		return code;
	}

	public void setCode(char code) {
		this.code = code;
	}

	public int getTotalCurrancy() {
		return totalCurrancy;
	}

	public void setTotalCurrancy(int totalCurrancy) {
		this.totalCurrancy = totalCurrancy;
	}

	public boolean isStrong() {
		return strong;
	}

	public void setStrong(boolean strong) {
		this.strong = strong;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public double getConvertingPrice() {
		return convertingPrice;
	}

	public void setConvertingPrice(double convertingPrice) {
		this.convertingPrice = convertingPrice;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public String getAcceptableCountries() {
		return acceptableCountries;
	}

	public void setAcceptableCountries(String acceptableCountries) {
		this.acceptableCountries = acceptableCountries;
	}

}
