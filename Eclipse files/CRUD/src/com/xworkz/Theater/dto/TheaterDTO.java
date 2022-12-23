package com.xworkz.Theater.dto;

public class TheaterDTO extends AbstractAuditDTO {
	private String id;
	private String name;
	private String brand;
	private int seat;

	public TheaterDTO() {
		super();
	}

	public TheaterDTO(String id, String name, String brand, int seat) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "TheaterDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", seat=" + seat + ", toString()="
				+ super.toString() + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

}
