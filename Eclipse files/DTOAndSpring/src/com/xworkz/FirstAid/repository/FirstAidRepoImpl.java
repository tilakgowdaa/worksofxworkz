package com.xworkz.FirstAid.repository;

import org.springframework.stereotype.Component;

import com.xworkz.FirstAid.dto.FirstAidDTO;
@Component
public class FirstAidRepoImpl implements FirstAidRepo{

	@Override
	public boolean save(FirstAidDTO dto) {
		
		System.out.println("running save method ");
		return true;
	}

}
