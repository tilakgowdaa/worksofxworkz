package com.xworkz.Terrorist.boot;

import com.xworkz.Terrorist.dto.TerroristDTO;
import com.xworkz.Terrorist.service.TerroristServiceImpl;

public class TerroristRunner {
	public static void main(String[] args) {
		TerroristDTO dto=new TerroristDTO("Osama", 65, "male", false, false, "Bombing", "thaliban");
		
		TerroristServiceImpl impl=new TerroristServiceImpl();
		impl.validateAndSave(dto);
		System.out.println(dto.getName());
				}
}
