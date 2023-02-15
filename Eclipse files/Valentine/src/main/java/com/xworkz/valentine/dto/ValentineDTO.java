package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ValentineDTO {
	@Size(max = 20, min = 3, message = "name cannot be less than 3 and greater than 20")
	private String name;
	@Size(max = 20, min = 3, message = "valentineName cannot be less than 3 and greater than 20")
	private String valentineName;
	@NotBlank(message = "Place must not be blank")
	private String places;
	@NotBlank(message = "Gift must not be blank")
	private String gifts;
}
