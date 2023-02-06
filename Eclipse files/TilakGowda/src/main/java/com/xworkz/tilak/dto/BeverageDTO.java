package com.xworkz.tilak.dto;

import lombok.Data;

@Data
public class BeverageDTO {

	private String brand;
	private double price;
	private boolean alcohol;
	private int quantity;
	private String color;
	private boolean tastesGood;
	private boolean goodForHealth;
	private boolean madeOfFruit;
}
