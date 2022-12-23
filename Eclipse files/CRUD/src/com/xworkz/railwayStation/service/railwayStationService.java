package com.xworkz.railwayStation.service;

import com.xworkz.railwayStation.dto.railwayStationDTO;
import com.xworkz.railwayStation.exception.InvalidTheaterDataException;

public interface railwayStationService {
	boolean validateAndSave(railwayStationDTO dto) throws InvalidTheaterDataException;

}
