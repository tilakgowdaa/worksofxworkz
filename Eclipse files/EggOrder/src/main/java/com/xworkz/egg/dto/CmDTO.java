package com.xworkz.egg.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CmDTO {

	@NotNull(message = "name cannot be null")
	@Size(min = 3, max = 20, message = "Name should be greter than 3 and lesser than 20")
	private String name;
	@NotBlank(message = "party cannot be blank")
	private String party;
	@NotBlank(message = "state cannot be blank")
	private String state;
	@NotNull(message = "tenure cannot be null")
	@Min(value = 1)
	private Integer tenure;
	@NotNull(message = "portfolio cannot be null")
	private String portfolio;
}
