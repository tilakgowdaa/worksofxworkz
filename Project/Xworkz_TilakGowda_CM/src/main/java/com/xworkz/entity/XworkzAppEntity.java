package com.xworkz.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "xworkzapp_table")
@NamedQuery(name = "findEmailCount", query = "Select count(*) from XworkzAppEntity entity where entity.emailId=:email")
@NamedQuery(name = "findUserIdCount" , query = "Select count(*) from XworkzAppEntity entity where entity.userId=:user")
@NamedQuery(name="findMobileCount",query = "Select count(*) from XworkzAppEntity entity where entity.mobileNo=:mobile")
public class XworkzAppEntity {
	@Id
	@Column(name = "signUpId")
	private int signUpId;
	@Column(name = "userId")
	private String userId;
	@Column(name = "emailId")
	private String email;
	@Column(name = "mobileNo")
	private String mobileNo;
	@Column(name = "password")
	private String password;
	@Column(name = "createdBy")
	private String createdBy;
	@Column(name = "createdDate")
	private LocalDate createdDate = LocalDate.now();
	@Column(name = "updatedBy")
	private String updatedBy;
	@Column(name = "updatedDate")
	private LocalDate updatedDate;

}
