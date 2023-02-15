package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.ValentineEntity;
import com.xworkz.valentine.repository.ValentineRepository;


@Service
public class ValentineServiceImpl implements ValentineService {

	@Autowired
	private ValentineRepository valentineRepo;

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
		ValentineEntity entity = new ValentineEntity();
		entity.setName(valentineDto.getName());
		entity.setValentineName(valentineDto.getValentineName());
		entity.setPlaces(valentineDto.getPlaces());
		entity.setGifts(valentineDto.getGifts());
		boolean saved = this.valentineRepo.save(entity);
		System.out.println("ValentineEntity saved :" + saved);
		return Collections.emptySet();

	}

}
