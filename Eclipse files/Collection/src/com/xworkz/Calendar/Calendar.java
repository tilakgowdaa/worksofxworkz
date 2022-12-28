package com.xworkz.Calendar;

import java.io.Serializable;

public class CalendarDTO implements Serializable {
	private String name;
	private int year;
	private int noOfPage;

	public CalendarDTO() {
		super();
	}

	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if (obj != null) {
			if (obj instanceof CalendarDTO) {
				CalendarDTO dto = (CalendarDTO) obj;
				if (dto.name.equals(this.name)) {
					System.out.println("Name is same : " + dto.name);
					return true;
				}
			}
		}
		System.out.println("data not matching");
		return false;
	}

	public CalendarDTO(String name, int year, int noOfPage) {
		super();
		this.name = name;
		this.year = year;
		this.noOfPage = noOfPage;
	}

	@Override
	public String toString() {
		return "Calendar [name=" + name + ", year=" + year + ", noOfPage=" + noOfPage + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNoOfPage() {
		return noOfPage;
	}

	public void setNoOfPage(int noOfPage) {
		this.noOfPage = noOfPage;
	}

}
