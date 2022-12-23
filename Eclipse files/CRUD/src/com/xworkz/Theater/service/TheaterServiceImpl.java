package com.xworkz.Theater.service;

import com.xworkz.Theater.dto.TheaterDTO;
import com.xworkz.Theater.exception.InvalidTheaterDataException;
import com.xworkz.Theater.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService {
	TheaterRepository theaterRepository;

	public TheaterServiceImpl(TheaterRepository theaterRepository) {
		super();
		this.theaterRepository = theaterRepository;
	}

	@Override
	public boolean validateAndSave(TheaterDTO dto) throws InvalidTheaterDataException {
		System.out.println("Running validateAndSave");
		String id = dto.getId();
		String name = dto.getName();
		String brand = dto.getBrand();
		int seat = dto.getSeat();
		boolean validId = false;
		boolean validName = false;
		boolean validBrand = false;
		boolean validSeat = false;
		if (id != null && id.length() > 3 && id.length() < 10) {
			System.out.println("Id is valid");
			validId = true;
		} else {
			System.out.println("Id is Invalid");
			validId = false;
		}

		if (name != null && name.length() > 3 && name.length() < 10) {
			System.out.println("name is valid");
			validName = true;
		} else {
			System.out.println("name is Invalid");
			validName = false;
		}

		if (brand != null && brand.length() > 3 && brand.length() < 10) {
			System.out.println("brand is valid");
			validBrand = true;
		} else {
			System.out.println("brand is Invalid");
			validId = false;
		}

		if (seat != 0 && seat > 0 && seat < 250) {
			System.out.println("brand is valid");
			validSeat = true;
		} else {
			System.out.println("seat is Invalid");
			validSeat = false;
		}

		if (validId && validName && validBrand && validSeat) {
			System.out.println("DTO is valid " + dto);
			boolean saved = theaterRepository.save(dto);
			System.out.println("Save success " + saved);
			return saved;
		}

		System.out.println("DTO is Invalid,cannot save");
		throw new InvalidTheaterDataException();
	}
}
