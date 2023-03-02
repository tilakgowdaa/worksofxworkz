package com.xworkz.amusement.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AmusementParkDTO {
	@NotBlank(message = "Name cannot be Blank")
	@Size(min = 3 , max = 20,message = "name should be greater than 3 and lesser than 20")
	private String name;
	@NotBlank(message = "Address cannot be Blank")
	@Size(min = 3 , max = 20,message = "address should be greater than 3 and lesser than 20")
	private String address;
	@NotNull
	private double entryFee;
	@Size(min = 3,max = 20,message = "ticketType should be greater than 3 and lesser than 20")
	@NotBlank(message = "ticketType cannot be Blank")
	private String ticketType;
	@NotNull(message = "childrenAllowed cannot be null")
	private boolean childrenAllowed;
	private int id;
}
