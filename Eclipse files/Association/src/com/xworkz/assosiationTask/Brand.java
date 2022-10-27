package com.xworkz.assosiationTask;

public class Brand {
	public String name;
	public String gstNo;
	public Location location=Location.Bangalore;
	public int rating;

	public Brand(String name, String gstNo,int rating) {
		this.name = name;
		this.gstNo = gstNo;
		this.rating = rating;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.gstNo);
		System.out.println(location);
		System.out.println(this.rating);
	}
}
