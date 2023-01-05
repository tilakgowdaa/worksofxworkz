package com.xworkz.Holiday;

import com.xworkz.Calendar.CalendarDTO;

public class HolidayDTO {
	private String holidayFor;
	private int noOfDays;
	private String holidayOn;

	public HolidayDTO() {
		super();
	}

	public HolidayDTO(String holidayFor, int noOfDays, String holidayOn) {
		super();
		this.holidayFor = holidayFor;
		this.noOfDays = noOfDays;
		this.holidayOn = holidayOn;
	}

	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if (obj != null) {
			if (obj instanceof HolidayDTO) {
				HolidayDTO dto = (HolidayDTO) obj;
				if (dto.holidayFor.equals(this.holidayFor)) {
					System.out.println("Name is same : " + dto.holidayFor);
					return true;
				}
			}
		}
		System.out.println("data not matching");
		return false;
	}

	@Override
	public String toString() {
		return "HolidayDTO [holidayFor=" + holidayFor + ", noOfDays=" + noOfDays + ", holidayOn=" + holidayOn
				+ ", toString()=" + super.toString() + "]";
	}

	public String getHolidayFor() {
		return holidayFor;
	}

	public void setHolidayFor(String holidayFor) {
		this.holidayFor = holidayFor;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getHolidayOn() {
		return holidayOn;
	}

	public void setHolidayOn(String holidayOn) {
		this.holidayOn = holidayOn;
	}

}
