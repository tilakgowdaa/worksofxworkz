package com.xworkz.egg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.EggDTO;
import com.xworkz.egg.repository.EggResository;
@Service
public class EggServiceImpl implements EggService {

	@Autowired
	private EggResository eggResository;

	public EggServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(EggDTO dto) {
		System.out.println("Running validateAndSave");
		boolean saved=this.eggResository.save(dto);
		System.out.println("Saved Service:"+dto);
		return saved;
	}

}
