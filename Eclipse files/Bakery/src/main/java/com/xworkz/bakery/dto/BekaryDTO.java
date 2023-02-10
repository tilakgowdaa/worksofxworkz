package com.xworkz.bakery.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Bekary")
public class BekaryDTO {
	@Column(name = "id")
	@Id
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "ownerName")
	private String ownerName;
	@Column(name = "wifeName")
	private String wifeName;
	@Column(name = "married")
	private boolean married;
	@Column(name = "famousFor")
	private String famousFor;
	@Column(name = "since")
	private String since;
}
