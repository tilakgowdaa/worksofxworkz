package com.xworkz.building.dto;

import com.xworkz.building.constant.Type;

public class buildingDTO extends AbstractAuditDTO {
	private int no;
	private String name;
	private int floors;
	private boolean lift;
	private boolean parking;
	private Type type;

	public buildingDTO() {
		super();
	}

	public buildingDTO(int no, String name, int floors, boolean lift, boolean parking, Type type) {
		super();
		this.no = no;
		this.name = name;
		this.floors = floors;
		this.lift = lift;
		this.parking = parking;
		this.type = type;
	}

	@Override
	public String toString() {
		return "buildingDTO [no=" + no + ", name=" + name + ", floors=" + floors + ", lift=" + lift + ", parking="
				+ parking + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getFloors() {
		return floors;
	}

	public boolean isLift() {
		return lift;
	}

	public boolean isParking() {
		return parking;
	}

	public Type getType() {
		return type;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
