package com.xworkz.associationTaskSecond;

public class Email {
	public String id;
	public String password;
	public long mobileNo;
	public Company company;

	public void setEmail(String id, String password, long mobileNo,Company company) {
		
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
		this.company=company;
	}

	/*
	 * public void setCompany(Company company) { this.company=company; }
	 */
	
	public void showOff() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		if(company!=null) {
			company.showOff();
		}
	}
}
