package com.xworkz.Terrorist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TerroristDTO extends AbstractAuditDTO {
	@NotNull(message = "Name cannot be null")
	@NotEmpty(message = "Name cannot be empty")
	@Size(max = 20,min = 3,message = "Name should be between 3 to 20")
	private String name;
	@NotNull(message = "Name cannot be null")
	@Max(value = 120,message = "age should be less than 120")
	@Min(value = 3,message = "age should be more than 3")
	private int age;
	@NotNull(message = "gender cannot be null")
	@Size(max = 10,min = 3,message = "gender should be between 3 to 20")
	private String gender;
	@NotNull(message = "prisoned cannot be null")
	private boolean prisoned;
	@NotNull(message = "alive cannot be null")
	private boolean alive;
	@NotNull(message = "specialization cannot be null")
	@NotEmpty(message = "specialization cannot be empty")
	@Size(max = 20,min = 3,message = "specialization should be between 3 to 20")
	private String specialization;
	@NotNull(message = "organization cannot be null")
	@NotEmpty(message = "organization cannot be empty")
	@Size(max = 20,min = 3,message = "organization should be between 3 to 20")
	private String organization;

}
