package com.xworkz.aeroplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.entity.AeroplaneEntity;
import com.xworkz.aeroplane.repository.AeroplaneRepository;

@Service
public class AeroplaneServiceImpl implements AeroplaneService {

	@Autowired
	private AeroplaneRepository aeroplaneRepository;

	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO aeroplaneDTO) {
		System.out.println("Running validateAndSave");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDTO>> violation = validator.validate(aeroplaneDTO);
		if (!violation.isEmpty()) {
			System.out.println("Violation occured");
			return violation;
		}
		System.out.println("No violations");
		AeroplaneEntity aeroplaneEntity = new AeroplaneEntity();
		aeroplaneEntity.setCompany(aeroplaneDTO.getCompany());
		aeroplaneEntity.setName(aeroplaneDTO.getName());
		aeroplaneEntity.setCost(aeroplaneDTO.getCost());
		aeroplaneEntity.setType(aeroplaneDTO.getType());
		aeroplaneEntity.setCountry(aeroplaneDTO.getCountry());
		boolean saved = this.aeroplaneRepository.save(aeroplaneEntity);
		System.out.println("saved :" + saved);
		return Collections.emptySet();

	}

	@Override
	public AeroplaneDTO findById(int id) {
		System.out.println("Running findById");
		if(id>0) {
			AeroplaneEntity aeroplaneEntity=this.aeroplaneRepository.findBy(id);
			
			if(aeroplaneEntity!=null) {
				System.out.println("Entity is Found :"+id);
				AeroplaneDTO aeroplaneDTO=new AeroplaneDTO();
				aeroplaneDTO.setCompany(aeroplaneEntity.getCompany());
				aeroplaneDTO.setCost(aeroplaneEntity.getCost());
				aeroplaneDTO.setCountry(aeroplaneEntity.getCountry());
				aeroplaneDTO.setName(aeroplaneEntity.getName());
				aeroplaneDTO.setType(aeroplaneEntity.getType());
				aeroplaneDTO.setId(aeroplaneEntity.getId());
				return aeroplaneDTO;
			}
		}
		
		
	return AeroplaneService.super.findById(id);	
	}

}
