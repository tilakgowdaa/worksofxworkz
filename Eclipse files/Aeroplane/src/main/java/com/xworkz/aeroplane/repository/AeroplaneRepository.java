package com.xworkz.aeroplane.repository;

import java.util.List;

import com.xworkz.aeroplane.entity.AeroplaneEntity;

public interface AeroplaneRepository {

	boolean save(AeroplaneEntity aeroplaneEntity);
	
	default AeroplaneEntity findBy(int id) {
		return null;
	}
	
	
	
	
	
}
