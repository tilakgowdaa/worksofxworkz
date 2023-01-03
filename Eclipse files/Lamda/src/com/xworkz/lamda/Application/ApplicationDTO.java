package com.xworkz.lamda.Application;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {
	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private double price;

	public ApplicationDTO() {
		super();
	}

	public ApplicationDTO(String name, double version, boolean free, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof ApplicationDTO ) {
				ApplicationDTO dto=(ApplicationDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("Name is same : "+this.name);
				}
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
