package com.xworkz.associationTaskSecond;

public class Job {
	public int salary;
	public String role;
	public boolean bond;
	public Company company;

	public void setJob(int salary, String role, boolean bond,Company company) {
		this.salary = salary;
		this.role = role;
		this.bond = bond;
		this.company=company;
	}


	public void showOff() {
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		if(company!=null) {
			company.showOff();
		}
	}

}
