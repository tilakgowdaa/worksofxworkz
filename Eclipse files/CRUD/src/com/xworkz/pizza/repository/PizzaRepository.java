package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.PizzaDTO;

public interface PizzaRepository {
	boolean save(PizzaDTO dto);
}
