package com.xworkz.lamda.Palace;

import java.io.Serializable;

public class PalaceDTO implements Serializable {
	private String name;
	private String location;
	private int builtin;
	private boolean destroyed;
	private double visitingFees;

	public PalaceDTO() {
		super();
	}

	public PalaceDTO(String name, String location, int builtin, boolean destroyed, double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtin = builtin;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}

	@Override
	public int hashCode() {
		return 35;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof PalaceDTO) {
				PalaceDTO dto = (PalaceDTO) obj;
				if (dto.name.equals(this.name)) {
					System.out.println("Name is Same : " + this.name);
					return true;

				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtin=" + builtin + ", destroyed="
				+ destroyed + ", visitingFees=" + visitingFees + "]";
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

	public int getBuiltin() {
		return builtin;
	}

	public void setBuiltin(int builtin) {
		this.builtin = builtin;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public double getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(double visitingFees) {
		this.visitingFees = visitingFees;
	}

}
