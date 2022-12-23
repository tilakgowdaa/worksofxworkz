package com.xworkz.railwayStation.repository;

import com.xworkz.railwayStation.dto.railwayStationDTO;
import com.xworkz.railwayStation.exception.StorageFullException;

public interface railwayStationRepository {
	boolean save(railwayStationDTO dto) throws StorageFullException;

}
