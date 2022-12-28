package com.xworkz.Place;

import java.io.Serializable;

public class PlaceDTO implements Serializable {
	private String name;
	private String state;
	private String country;

	public PlaceDTO() {
		super();
	}
	
	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if(obj!=null) {
			if(obj instanceof PlaceDTO) {
				PlaceDTO dto=(PlaceDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is same : "+dto.name);
					return true;
				}
			}
		}
		System.out.println("data not matching");
		return false;
		
	}

	public PlaceDTO(String name, String state, String country) {
		super();
		this.name = name;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Place [name=" + name + ", state=" + state + ", country=" + country + ", toString()=" + super.toString()
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
