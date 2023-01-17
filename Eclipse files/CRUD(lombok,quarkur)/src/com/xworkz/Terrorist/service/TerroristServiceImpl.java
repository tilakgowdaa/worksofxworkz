package com.xworkz.Terrorist.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.Terrorist.dto.TerroristDTO;

public class TerroristServiceImpl implements TerroristService {

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("started validate and save");
		System.out.println("DTO passes "+dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> constraintViolations =  validator.validate(dto);
		if(!constraintViolations.isEmpty()) {
			System.out.println("Error in data");
			constraintViolations.forEach(ele->System.out.println(ele.getMessage()));
		}
		return false;
	}

}
