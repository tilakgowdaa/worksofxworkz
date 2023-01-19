package com.xworkz.Missile.repository;

import org.springframework.stereotype.Component;

import com.xworkz.Missile.dto.MissileDTO;
@Component
public class MissileRepositoryImpl implements MissileRepository {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("running save method");
		return true;
	}

}
