package com.xworkz.Theater.service;

import com.xworkz.Theater.dto.TheaterDTO;
import com.xworkz.Theater.exception.InvalidTheaterDataException;

public interface TheaterService {
boolean validateAndSave(TheaterDTO dto) throws InvalidTheaterDataException;
}
