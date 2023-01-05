package com.xworkz.sort;

import java.io.Serializable;

public class WeaponDTO implements Serializable, Comparable<WeaponDTO> {
	private String name;
	private String madeBy;
	private String madeOn;
	private double price;
	private Type type;

	public WeaponDTO() {
		super();
	}

	public WeaponDTO(String name, String madeBy, String madeOn, double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
	@Override
	public int compareTo(WeaponDTO arg0) {

		return arg0.name.compareTo(this.name);
	}
	
	@Override
	public int hashCode() {
		return 44;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeaponDTO) {
				WeaponDTO dto=(WeaponDTO)obj;
				if(this.name.equals(dto.name)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
