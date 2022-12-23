package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.repository.PizzaRepository;

public class PizzaServiceImpl implements PizzaService {

	PizzaRepository pizzaRepository;

	public PizzaServiceImpl(PizzaRepository pizzaRepository) {
		super();
		this.pizzaRepository = pizzaRepository;
	}

	@Override
	public boolean validateAndSave(PizzaDTO pizzaDTO) {
		System.out.println("Running validateAndSave");
		String name = pizzaDTO.getName();
		String company = pizzaDTO.getCompany();
		PizzaSize size = pizzaDTO.getSize();
		double price = pizzaDTO.getPrice();
		String type = pizzaDTO.getType();
		boolean nameis = false;
		boolean companyis = false;
		boolean sizeis = false;
		boolean priceis = false;
		boolean typeis = false;
		if (name != null && name.length() > 4 && name.length() < 20) {
			System.out.println("Pizza name is valid " + name);
			nameis = true;
		} else {
			System.err.println("Pizza name is Invalid " + name);
		}

		if (company != null && company.length() > 4 && company.length() < 20) {
			System.out.println("Company name is valid " + company);
			companyis = true;
		} else {
			System.out.println("company name is Invalid " + company);
		}

		if (size != null) {
			System.out.println("size is valid " + size);
			sizeis = true;
		} else {
			System.out.println("size is invalid " + size);
		}

		if (price > 50 && price < 2000) {
			System.out.println("valid price " + price);
			priceis = true;
		} else {
			System.out.println("invalid price " + price);
		}

		if (type != null && type == "VEG" || type == "NON VEG") {
			System.out.println("type is valid " + type);
			typeis = true;
		} else {
			System.out.println("type is Invalid " + type);
		}

		if (nameis && companyis && sizeis && priceis && typeis) {
			System.out.println("DTO valid,can save using repo");
			boolean saved = this.pizzaRepository.save(pizzaDTO);
			System.out.println("DTO saved " + saved);
			return true;
		}

		System.out.println("DTO Invalid");
		return false;
	}
}
