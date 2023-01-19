package com.xworkz.Resort.repository;

import org.springframework.stereotype.Component;

import com.xworkz.Resort.dto.ResortDTO;
@Component
public class ResortRepositoryImpl implements ResortRepository {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("running save method");
		return true;
	}

}
