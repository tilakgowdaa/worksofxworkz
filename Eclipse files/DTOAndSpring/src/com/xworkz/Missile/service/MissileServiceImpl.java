package com.xworkz.Missile.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.Missile.dto.MissileDTO;
import com.xworkz.Missile.repository.MissileRepository;

@Component
public class MissileServiceImpl implements MissileService {
	@Autowired
	private Validator validator;
	@Autowired
	private MissileRepository missileRepo;

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("Started validateAndSave");
		System.out.println("DTO passed " + dto);

		Set<ConstraintViolation<MissileDTO>> violation = this.validator.validate(dto);
		if (!violation.isEmpty()) {
			System.out.println("Error...");
			violation.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("DTO valid");
			boolean saved = missileRepo.save(dto);
			System.out.println("Saved :" + dto);
			return saved;
		}

	}

}
