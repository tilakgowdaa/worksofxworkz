package com.xworkz.railwayStation.dto;

public class railwayStationDTO extends AbstractAuditDTO {
	private String name;
	private int noOfPlatforms;
	private String area;
	private int platformTicketPrice;

	public railwayStationDTO() {
		super();
	}

	public railwayStationDTO(String name, int noOfPlatforms, String area, int platformTicketPrice) {
		super();
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.area = area;
		this.platformTicketPrice = platformTicketPrice;
	}

	@Override
	public String toString() {
		return "railwayStationDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public String getArea() {
		return area;
	}

	public int getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setPlatformTicketPrice(int platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}

}
