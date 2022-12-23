package com.xworkz.building.repository;

import com.xworkz.building.dto.buildingDTO;
import com.xworkz.building.exception.StorageFullException;

public class buildingRepositoryImpl implements buildingRepository {
	private buildingDTO[] dtoArray = new buildingDTO[2];
	private int presentIndex = 0;

	@Override
	public boolean save(buildingDTO dto) {
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
