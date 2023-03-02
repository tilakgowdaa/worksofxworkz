package com.xworkz.amusement.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.amusement.dto.AmusementParkDTO;

public interface AmusementParkService {

	Set<ConstraintViolation<AmusementParkDTO>> validateAndSave(AmusementParkDTO amusementParkDTO);

	default AmusementParkDTO findByID(int id) {
		return null;
	}

	default List<AmusementParkDTO> findByName(String name) {
		return null;
	}
	
	Set<ConstraintViolation<AmusementParkDTO>> validateAndUpdate(AmusementParkDTO amusementParkDTO);

	default boolean validateAnddelete(int id) {
		return false;
	}
}
