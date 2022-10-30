package com.xworkz.associationOneToMany;

public class President {
	public String presidentName;
	public int tenure;
	public Gender gender;

	public String getPresidentName() {
		return presidentName;
	}

	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public President(String presidentName, int tenure) {
		this.presidentName = presidentName;
		this.tenure = tenure;
	}

	public void showOff() {
		System.out.println(this.presidentName);
		System.out.println(this.tenure);
		System.out.println(this.gender);
	}

}
