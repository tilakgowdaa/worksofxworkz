package com.xworkz.building.service;

import com.xworkz.building.dto.buildingDTO;
import com.xworkz.building.exception.InvalidTheaterDataException;

public interface buildingService {
	boolean validateAndSave(buildingDTO dto) throws InvalidTheaterDataException;

}
