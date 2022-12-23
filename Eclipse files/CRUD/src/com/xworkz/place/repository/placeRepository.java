package com.xworkz.place.repository;

import com.xworkz.place.dto.placeDTO;
import com.xworkz.place.exception.StorageFullException;

public interface placeRepository {
	boolean save(placeDTO dto) throws StorageFullException;

}
