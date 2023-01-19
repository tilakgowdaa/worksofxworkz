package com.xworkz.FirstAid.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.FirstAid.dto.FirstAidDTO;
import com.xworkz.FirstAid.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {

	@Autowired
	private FirstAidRepo firstAidRepo;
	@Autowired
	private Validator validator;

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("Started validateAndSave");
		System.out.println("DTO passed " + dto);

		Set<ConstraintViolation<FirstAidDTO>> violation = this.validator.validate(dto);
		if (!violation.isEmpty()) {
			System.out.println("Error...");
			violation.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("DTO valid");
			boolean saved = firstAidRepo.save(dto);
			System.out.println("Saved :" + dto);
			return saved;
		}
	}

}
