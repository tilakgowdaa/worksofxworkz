package com.xworkz.TaskOnEncapsulation;

public class Grocery {
	public String storeName="xworkz store";
	public String location="rajainagar";
	public int workers=20;
	public int maleWorkers=12;
	public int femaleWorkers=8;
	public boolean stock=true;
	public boolean homeDelivery=true;
	public String reviews="Good";
	public int rating=5;
	public boolean onlineOrder=false;
	public double discount=10.0;

	void setGrocery(String storeName, String location, int workers, int maleWorkers, int femaleWorkers, boolean stock,
			boolean homeDelivery, String reviews, int rating, boolean onlineOrder, double discount) {
		this.storeName = storeName;
		this.location = location;
		this.workers = workers;
		this.maleWorkers = maleWorkers;
		this.femaleWorkers = femaleWorkers;
		this.stock = stock;
		this.homeDelivery = homeDelivery;
		this.reviews = reviews;
		this.rating = rating;
		this.onlineOrder = onlineOrder;
		this.discount = discount;
	}

	public String getStoreName() {
		return storeName;
	}

	public String getLocation() {
		return location;
	}

	public int getWorkers() {
		return workers;
	}

	public int getMaleWorkers() {
		return maleWorkers;
	}

	public int getFemaleWorkers() {
		return femaleWorkers;
	}

	public boolean isStock() {
		return stock;
	}

	public boolean isHomeDelivery() {
		return homeDelivery;
	}

	public String getReviews() {
		return reviews;
	}

	public int getRating() {
		return rating;
	}

	public boolean isOnlineOrder() {
		return onlineOrder;
	}

	public double getDiscount() {
		return discount;
	}

}
