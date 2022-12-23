package com.xworkz.railwayStation.repository;

import com.xworkz.railwayStation.exception.StorageFullException;
import com.xworkz.railwayStation.dto.railwayStationDTO;

public class railwayStationRepositoryImpl implements railwayStationRepository {
	private railwayStationDTO[] dtoArray = new railwayStationDTO[2];
	private int presentIndex = 0;

	@Override
	public boolean save(railwayStationDTO dto) {
		System.out.println("Running save in repo " + dto);
		if (this.presentIndex > this.dtoArray.length) {
			System.err.println("Size exceeded, cannot add DTO");
			throw new StorageFullException("Storage full");

		}
		this.dtoArray[this.presentIndex] = dto;
		System.out.println("DTO saved " + dto + " in the Index " + presentIndex);
		presentIndex++;
		return true;
	}
}
