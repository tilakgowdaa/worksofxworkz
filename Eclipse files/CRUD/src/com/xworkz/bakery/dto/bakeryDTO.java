package com.xworkz.bakery.dto;

public class bakeryDTO extends AbstractAuditDTO {
	private String name;
	private String owner;
	private long contactNo;
	private String famousFor;

	public bakeryDTO() {
		super();
	}

	public bakeryDTO(String name, String owner, long contactNo, String famousFor) {
		super();
		this.name = name;
		this.owner = owner;
		this.contactNo = contactNo;
		this.famousFor = famousFor;
	}

	@Override
	public String toString() {
		return "bakeryDTO [name=" + name + ", owner=" + owner + ", contactNo=" + contactNo + ", famousFor=" + famousFor
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	

}
