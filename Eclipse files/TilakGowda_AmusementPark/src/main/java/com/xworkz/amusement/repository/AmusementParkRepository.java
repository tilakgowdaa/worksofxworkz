package com.xworkz.amusement.repository;

import java.util.List;

import com.xworkz.amusement.entity.AmusementParkEntity;

public interface AmusementParkRepository {

	boolean save(AmusementParkEntity amusementParkEntity);
	
	default AmusementParkEntity findBy(int id) {
		return null;
	}
	
	default List<AmusementParkEntity> findBy(String name){
		return null;
	}
	
	boolean update(AmusementParkEntity amusementParkEntity);
	
	boolean delete(int id);
	
	default List<AmusementParkEntity> findAll(){
		return null;
	}
	
	default List<AmusementParkEntity> findByPrice(double entryFee){
		return null;
	}
	
	default List<AmusementParkEntity> findByNameAndPrice(String name ,double entryFee){
		return null;
	}
}