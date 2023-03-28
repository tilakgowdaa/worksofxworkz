package com.xworkz.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class XworkzAppDto {
	@NotBlank
	@Size(min = 3,max = 20,message = "UserId cannot be less than 3 or more than 20 characters")
	private String userId;
	@NotBlank
	@Size(min =8 ,max = 30,message = "email cannot be less than 3 or more than 20 characters")
	private String email;
	@NotBlank
	@Size(min = 3,max = 20,message = "mobileNo cannot be less than 3 or more than 20 characters")
	private String mobileNo;
	@NotBlank
	@Size(min = 3,max = 20,message = "password cannot be less than 3 or more than 20 characters")
	private String password;
	@NotBlank
	@Size(min = 3,max = 20,message = "confirmPassword cannot be less than 3 or more than 20 characters")
	private String confirmPassword;
}
