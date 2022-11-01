package com.xworkz.associationTaskSecond;

public class Company {
	public String name;
	public String ownerName;
	public Address address;

	public void setCompany(String name, String ownerName,Address address) {
		this.name = name;
		this.ownerName = ownerName;
		this.address=address;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.ownerName);
		if(address!=null) {
			address.showOff();
		}
	}

}
