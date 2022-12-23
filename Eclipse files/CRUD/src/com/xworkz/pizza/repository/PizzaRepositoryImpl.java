package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.PizzaDTO;

public abstract class PizzaRepositoryImpl implements PizzaRepository {
	private PizzaDTO[] dto=new PizzaDTO[10];
	private int currentIndex = 0;

	@Override
	public boolean save(PizzaDTO dto) {
		System.out.println("Running save");
		if (this.currentIndex >= this.dto.length) {
			System.out.println("Storage is full");
			return false;
		}
		this.dto[this.currentIndex] = dto;
		System.out.println("Data saved " + dto + "in index " + this.currentIndex);
		currentIndex++;
		return true;
	}

}
