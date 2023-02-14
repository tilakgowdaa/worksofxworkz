package com.xworkz.egg.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.egg.dto.CmDTO;
import com.xworkz.egg.dto.CmEntity;

public interface CmService {

	
	 Set<ConstraintViolation<CmDTO>> validateAndSave(CmDTO cmDTO);
}
