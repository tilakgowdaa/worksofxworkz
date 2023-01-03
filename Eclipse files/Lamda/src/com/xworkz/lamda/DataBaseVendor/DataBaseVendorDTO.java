package com.xworkz.lamda.DataBaseVendor;

import java.io.Serializable;

public class DataBaseVendorDTO implements Serializable {
	private String name;
	private String developedBy;
	private Size size;
	private int licenseCost;
	private Type type;

	public DataBaseVendorDTO() {
		super();
	}

	public DataBaseVendorDTO(String name, String developedBy, Size size, int licenseCost, Type type) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.size = size;
		this.licenseCost = licenseCost;
		this.type = type;
	}

	@Override
	public int hashCode() {
		return 28;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DataBaseVendorDTO) {
				DataBaseVendorDTO dto = (DataBaseVendorDTO) obj;
				if (dto.name.equals(this.name)) {
					System.out.println("Name is same : " + this.name);
				}
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", size=" + size + ", licenseCost="
				+ licenseCost + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public int getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(int licenseCost) {
		this.licenseCost = licenseCost;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
