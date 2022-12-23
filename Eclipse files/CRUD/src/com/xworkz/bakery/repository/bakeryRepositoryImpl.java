package com.xworkz.bakery.repository;

import com.xworkz.bakery.dto.bakeryDTO;
import com.xworkz.bakery.exception.StorageFullException;

public class bakeryRepositoryImpl implements bakeryRepository{
	private bakeryDTO[] dtoArray = new bakeryDTO[2];
	private int presentIndex = 0;

	@Override
	public boolean save(bakeryDTO dto) {
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
