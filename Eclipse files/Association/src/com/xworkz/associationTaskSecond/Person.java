package com.xworkz.associationTaskSecond;

public class Person {
	public String name;
	public Email[] email;
	public Job job;

	public void setPerson(String name,Email[] email,Job job) {
		this.name = name;
		this.email=email;
		this.job=job;
	}

	/*
	 * public void setEmail(Email[] email) { this.email = email; }
	 * 
	 * public void setJob(Job job) { this.job = job; }
	 */

	public void showOff() {
		System.out.println(this.name);
		if (this.email != null) {
			for (int i = 0; i < email.length; i++) {
				Email email = this.email[i];
				if (email != null) {
					email.showOff();
				}
			}
		}
		else {
			System.out.println("Email is null");
		}
		
		if(job!=null) {
			job.showOff();
		}
	}

}
