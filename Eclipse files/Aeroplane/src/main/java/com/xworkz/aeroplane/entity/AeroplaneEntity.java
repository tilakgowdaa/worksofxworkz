package com.xworkz.aeroplane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Aeroplane_table")
public class AeroplaneEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "company")
	private String company;
	@Column(name = "name")
	private String name;
	@Column(name = "cost")
	private double cost;
	@Column(name = "type")
	private String type;
	@Column(name = "country")
	private String country;
}
