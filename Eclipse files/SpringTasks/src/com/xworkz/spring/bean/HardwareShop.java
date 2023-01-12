package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	@Qualifier("number")
	private int id;
	@Autowired
	@Qualifier("hesaru")
	private String name;
	@Autowired
	@Qualifier("gstnumber")
	private String gstNo;
	@Autowired
	@Qualifier("owner")
	private String ownerName;
	@Autowired
	@Qualifier("address")
	private String address;

	public HardwareShop() {
		System.out.println("Created HardwareShop...");
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getAddress() {
		return address;
	}

	public String getGstNo() {
		return gstNo;
	}

}
