package com.xworkz.egg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Cm")
public class CmEntity {
	@Column(name = "id")
	@Id
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "party")
	private String party;
	@Column(name = "state")
	private String state;
	@Column(name = "tenure")
	private Integer tenure;
	@Column(name = "portfolio")
	private String portfolio;
}
