package com.xworkz.Soldier.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO {
	@NotBlank(message = "Name cannot be blank")
	@NotNull(message = "Name cannot be null")
	@Size(max = 3,min = 20,message = "max 20,min 3")
	private String name;
	//@Max(value = 20,message = "id cannot be > 20")
	//@Min(value = 20,message = "id cannot be < 0")
	private int id;
	//@NotBlank(message = "rank cannot be blank")
	//@NotNull(message = "rank cannot be null")
	//@Size(max = 3,min = 20)
	private String rank;
	//@NotBlank(message = "batallion cannot be blank")
	//@NotNull(message = "batallion cannot be null")
	//@Size(max = 3,min = 20)
	private String batallion;
	//@NotBlank(message = "country cannot be blank")
	//@NotNull(message = "country cannot be null")
	//@Size(max = 3,min = 20)
	private String country;
}
