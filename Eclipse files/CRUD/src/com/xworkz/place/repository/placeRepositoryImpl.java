package com.xworkz.place.repository;

import com.xworkz.building.exception.StorageFullException;
import com.xworkz.place.dto.placeDTO;

public class placeRepositoryImpl implements placeRepository {
	private placeDTO[] dtoArray = new placeDTO[2];
	private int presentIndex = 0;

	@Override
	public boolean save(placeDTO dto) {
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
