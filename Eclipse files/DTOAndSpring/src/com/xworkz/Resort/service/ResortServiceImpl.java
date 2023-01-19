package com.xworkz.Resort.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.Resort.dto.ResortDTO;
import com.xworkz.Resort.repository.ResortRepository;

@Component
public class ResortServiceImpl implements ResortService {
	@Autowired
	private Validator validator;
	@Autowired
	private ResortRepository resortRepo;

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Started validateAndSave");
		System.out.println("DTO passed " + dto);

		Set<ConstraintViolation<ResortDTO>> violation = this.validator.validate(dto);
		if (!violation.isEmpty()) {
			System.out.println("Error...");
			violation.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("DTO valid");
			boolean saved = resortRepo.save(dto);
			System.out.println("Saved :" + dto);
			return saved;
		}

	}

}
