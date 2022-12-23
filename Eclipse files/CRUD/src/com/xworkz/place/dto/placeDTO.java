package com.xworkz.place.dto;

public class placeDTO extends AbstractAuditDTO {
	private String name;
	private String state;
	private String country;
	private boolean touristPlace;
	private boolean parking;

	public placeDTO() {
		super();
	}

	public placeDTO(String name, String state, String country, boolean touristPlace, boolean parking) {
		super();
		this.name = name;
		this.state = state;
		this.country = country;
		this.touristPlace = touristPlace;
		this.parking = parking;
	}

	@Override
	public String toString() {
		return "placeDTO [name=" + name + ", state=" + state + ", country=" + country + ", touristPlace=" + touristPlace
				+ ", parking=" + parking + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public boolean isTouristPlace() {
		return touristPlace;
	}

	public boolean isParking() {
		return parking;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setTouristPlace(boolean touristPlace) {
		this.touristPlace = touristPlace;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

}
