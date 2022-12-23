package com.xworkz.Helmet.service;

import com.xworkz.Helmet.constant.Color;
import com.xworkz.Helmet.constant.Type;
import com.xworkz.Helmet.dto.HelmetDTO;
import com.xworkz.Helmet.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService {

	HelmetRepository helmetRepository;

	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		super();
		this.helmetRepository = helmetRepository;
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {
		String brand = dto.getBrand();
		Color color = dto.getColor();
		Type type = dto.getType();
		Double price = dto.getPrice();
		boolean validBrand = false;
		boolean validColor = false;
		boolean validType = false;
		boolean validPrice = false;
		if (brand != null && brand.length() >= 4 && brand.length() <= 10) {
			System.out.println("Brand is valid");
			validBrand = true;
		} else {
			System.out.println("brand is Invalid");
			validBrand = false;
		}

		if (color != null) {
			System.out.println("Color is valid");
			validColor = true;
		} else {
			System.out.println("Color is Invalid");
			validColor = false;
		}

		if (price != null && price > 100 && price < 10000) {
			System.out.println("Price is valid");
			validPrice = true;
		} else {
			System.out.println("price is Invalid");
			validPrice = false;
		}

		if (type != null) {
			System.out.println("Type i valid");
			validType = true;
		} else {
			System.out.println("Type is Invalid");
			validType = false;
		}

		if (validBrand && validType && validColor && validPrice) {
			System.out.println("DTO is Valid "+dto);
			boolean saved=helmetRepository.save(dto);
			System.out.println("DTO is saved "+ dto);
			return saved;
		}

		System.out.println("DTO is invalid");
		return false;
	}
}
