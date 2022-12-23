package com.xworkz.building.repository;

import com.xworkz.Theater.exception.StorageFullException;
import com.xworkz.building.dto.buildingDTO;

public interface buildingRepository {
	boolean save(buildingDTO dto) throws StorageFullException;

}
