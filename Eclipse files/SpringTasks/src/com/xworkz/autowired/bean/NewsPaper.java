package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("no")
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("lang")
	private String language;
	private double price;

	public NewsPaper(@Qualifier("newsPaperName") String name, @Qualifier("owner") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	public double getPrice() {
		return price;
	}
	
	@Autowired
	@Qualifier("rate")
	public void setPrice(double price) {
		this.price = price;
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

	public String getLanguage() {
		return language;
	}

}
