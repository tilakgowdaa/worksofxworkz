package com.xworkz.Theater.repository;

import com.xworkz.Theater.dto.TheaterDTO;
import com.xworkz.Theater.exception.StorageFullException;

public class TheaterRepositoryImpl implements TheaterRepository {
	private TheaterDTO[] dtoArray = new TheaterDTO[2];
	private int presentIndex = 0;

	@Override
	public boolean save(TheaterDTO dto) {
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
