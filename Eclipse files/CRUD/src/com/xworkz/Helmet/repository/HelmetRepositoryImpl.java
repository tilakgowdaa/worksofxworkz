package com.xworkz.Helmet.repository;

import com.xworkz.Helmet.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository {
	private HelmetDTO[] dtoArray=new HelmetDTO[10];
	private int currentIndex = 0;

	@Override
	public boolean save(HelmetDTO dto) {
		System.out.println("Running save in repo"+dto);
		if (this.currentIndex >= this.dtoArray.length) {
			System.out.println("Storage is full,cannot add DTO");
			return false;
			
		}
	 
		this.dtoArray[this.currentIndex]=dto;
		System.out.println("Data saved "+dto+" in the index "+currentIndex);
		currentIndex++;
		return true;
		
	}
}
