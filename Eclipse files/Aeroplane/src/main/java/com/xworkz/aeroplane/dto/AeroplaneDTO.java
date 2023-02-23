package com.xworkz.aeroplane.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AeroplaneDTO {
	@NotBlank(message = "Company cannot be blank")
	@Size(max = 20, min = 3)
	private String company;
	@NotBlank(message = "name cannot be blank")
	@Size(max = 20, min = 3)
	private String name;
	@Min(value = 0, message = "cost should be greater than 0")
	private double cost;
	@NotBlank(message = "type cannot be blank")
	@Size(max = 20, min = 3)
	private String type;
	@NotBlank(message = "country cannot be blank")
	@Size(max = 20, min = 3)
	private String country;
	private int id;
}
