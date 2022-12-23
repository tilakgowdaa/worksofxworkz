package com.xworkz.bakery.repository;

import com.xworkz.bakery.dto.bakeryDTO;
import com.xworkz.bakery.exception.StorageFullException;

public interface bakeryRepository {
boolean save(bakeryDTO dto) throws StorageFullException;
}
