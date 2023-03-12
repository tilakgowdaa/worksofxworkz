package com.xworkz.amusement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "amusementParkTable")
@Data
@NoArgsConstructor
@NamedQuery(name = "findByName",query = "select entity from AmusementParkEntity entity where entity.name=:set")
@NamedQuery(name = "findAll" ,query = "from AmusementParkEntity")
@NamedQuery(name = "findByPrice" ,query = "select entity from AmusementParkEntity entity where entity.entryFee=:price")
@NamedQuery(name = "findByNameAndPrice" ,query = "select entity from AmusementParkEntity entity where entity.name=:name And entity.entryFee=:price")
public class AmusementParkEntity {
	@Id
	@Column(name = "id")
	
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
	@Column(name = "entryFee")
	private double entryFee;
	@Column(name = "ticketType")
	private String ticketType;
	@Column(name = "childrenAllowed")
	private boolean childrenAllowed;
	
	
}
