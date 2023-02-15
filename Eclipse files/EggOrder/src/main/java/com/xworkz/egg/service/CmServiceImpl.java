package com.xworkz.egg.service;

import java.util.Collections; 
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.CmDTO;

@Service
public class CmServiceImpl implements CmService {

	@Override
	public Set<ConstraintViolation<CmDTO>> validateAndSave(CmDTO cmDTO) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CmDTO>> constraintViolations = validator.validate(cmDTO);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("ConstraintViolations exist");
			return constraintViolations;
		} else {
			System.out.println("no ConstraintViolation");
			return Collections.emptySet();
		}

	}

}
