package com.xworkz.bakery.service;

import com.xworkz.bakery.exception.InvalidTheaterDataException;
import com.xworkz.bakery.dto.bakeryDTO;

public interface bakeryService {
	boolean validateAndSave(bakeryDTO dto) throws InvalidTheaterDataException;
 
}
