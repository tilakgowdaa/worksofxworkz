package com.xworkz.egg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Egg_table")
public class EggDTO {
	@Column(name = "id")
	@Id
	private int id;
	@Column(name = "hotelName")
	private String hotelName;
	@Column(name = "dishName")
	private String dishName;
	@Column(name = "type")
	private String type;
	@Column(name = "price")
	private Double price;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "takeAway")
	private boolean takeAway;
	
}
