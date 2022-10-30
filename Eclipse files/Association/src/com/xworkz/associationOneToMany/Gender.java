package com.xworkz.associationOneToMany;

public enum Gender {
	Male("Male"), Female("Female"), Trans("Trans");

	public String name;

	private Gender(String name) {
		this.name = name;
	}
}
