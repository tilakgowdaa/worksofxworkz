package com.xworkz.aeroplane.repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;

public interface AeroplaneRepository {

	boolean save(AeroplaneEntity aeroplaneEntity);
	
	AeroplaneEntity findBy(int id);
}
