package com.xworkz.Soldier.boot;

import com.xworkz.Soldier.dto.SoldierDTO;
import com.xworkz.Soldier.repository.SoldierRepositoryImpl;
import com.xworkz.Soldier.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		SoldierDTO dto=new SoldierDTO("Sandeep", 2, "Second", "BSF", "India");
		SoldierRepositoryImpl repo=new SoldierRepositoryImpl();
		SoldierServiceImpl service=new SoldierServiceImpl(repo);
		service.validateAndSave(dto);
	}

}
