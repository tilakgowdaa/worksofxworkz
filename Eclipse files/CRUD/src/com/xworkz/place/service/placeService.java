package com.xworkz.place.service;

import com.xworkz.place.dto.placeDTO;
import com.xworkz.place.exception.InvalidTheaterDataException;

public interface placeService {
	boolean validateAndSave(placeDTO dto) throws InvalidTheaterDataException;

}
