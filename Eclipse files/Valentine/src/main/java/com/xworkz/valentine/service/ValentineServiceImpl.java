package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDTO;

@Service
public class ValentineServiceImpl implements ValentineService {

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO valentineDto) {
		System.out.println("Running ValidateAndSave method");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violation = validator.validate(valentineDto);
		if (!violation.isEmpty()) {
			System.err.println("Violation occured");
			return violation;
		}
		System.out.println("No violations");
		return Collections.emptySet();
	}

}
