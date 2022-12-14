package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImpl;

public class PizzaRunner {
	public static void main(String[] args) {
		PizzaDTO dto = new PizzaDTO("Corn Pizza", "Domino's", PizzaSize.small, false, 300, "VEG");
		dto.setCreatedby("System");
		dto.setCreatedDate(LocalDateTime.now());
		
		PizzaService service=new PizzaServiceImpl();
		service.validateAndSave(dto);
		System.out.println(dto.getCreatedby());
		System.out.println(dto.getCreatedDate());
	}
}
