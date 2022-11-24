package com.xworkz.equality;

public class Paint {
	private String brand;
	private String company;
	private String color;
	private double price;
	private boolean quality;
	private String mftDate;
	private String expDate;
	private String batchNo;
	private String transportMode;
	private int rating;

	public Paint() {
		super();
		System.out.println("running default const");
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", company=" + company + ", color=" + color + ", price=" + price + ", quality="
				+ quality + ", mftDate=" + mftDate + ", expDate=" + expDate + ", batchNo=" + batchNo
				+ ", transportMode=" + transportMode + ", rating=" + rating + "]";
	}

	public Paint(String brand, String company, String color, double price, boolean quality, String mftDate,
			String expDate, String batchNo, String transportMode, int rating) {
		super();
		this.brand = brand;
		this.company = company;
		this.color = color;
		this.price = price;
		this.quality = quality;
		this.mftDate = mftDate;
		this.expDate = expDate;
		this.batchNo = batchNo;
		this.transportMode = transportMode;
		this.rating = rating;
	}

	@Override
	public boolean equals(Object point) {
		System.out.println("equals method running");
		if (point instanceof Paint) {
			System.out.println("point is Paint,can check");
			Paint cast=(Paint)point;
			if(this.brand.equals(cast.brand)) {
				System.out.println("brand is same");
				return true;
			}
		} 
		else {
			System.out.println("point is not Paint");
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getMftDate() {
		return mftDate;
	}

	public void setMftDate(String mftDate) {
		this.mftDate = mftDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
