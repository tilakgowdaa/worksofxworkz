package com.xworkz.festival;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "festival_table")

public class FestivalEntity {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "region")
	private String region;
	@Column(name = "totalDays")
	private int totalDays;
	@Column(name = "sweet")
	private String sweet;
	@Column(name = "mainGod")
	private String mainGod;

	public FestivalEntity() {
		super();
	}

	public FestivalEntity(String name, String region, int totalDays, String sweet, String mainGod) {
		super();
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}

}
