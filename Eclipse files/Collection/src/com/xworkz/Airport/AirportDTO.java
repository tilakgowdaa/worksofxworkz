package com.xworkz.Airport;

import java.io.Serializable;

public class AirportDTO implements Serializable {
	private String name;
	private String location;
	private int terminals;

	public AirportDTO() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if (obj != null) {
			if (obj instanceof AirportDTO) {
				AirportDTO ref = (AirportDTO) obj;
				if (ref.name.equals(this.name)) {
					System.out.println("Name is same : " + ref.name);
					return true;
				}
			}
		}
		System.out.println("data not matching");
		return false;

	}

	public AirportDTO(String name, String location, int terminals) {
		super();
		this.name = name;
		this.location = location;
		this.terminals = terminals;
	}

	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", location=" + location + ", terminals=" + terminals + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTerminals() {
		return terminals;
	}

	public void setTerminals(int terminals) {
		this.terminals = terminals;
	}

}
