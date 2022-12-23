package com.xworkz.Theater.repository;

import com.xworkz.Theater.dto.TheaterDTO;
import com.xworkz.Theater.exception.StorageFullException;

public interface TheaterRepository {
boolean save(TheaterDTO dto) throws StorageFullException;
}
