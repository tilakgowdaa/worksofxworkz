package com.xworkz.bakery.service;

import com.xworkz.bakery.dto.bakeryDTO;
import com.xworkz.bakery.exception.InvalidTheaterDataException;
import com.xworkz.bakery.repository.bakeryRepository;

public class bakeryServiceImpl implements bakeryService{
	bakeryRepository bakeryRepository;

	public bakeryServiceImpl(bakeryRepository bakeryRepository) {
		super();
		this.bakeryRepository = bakeryRepository;
	}

	@Override
	public boolean validateAndSave(bakeryDTO dto) throws InvalidTheaterDataException {
		System.out.println("Running validateAndSave");
		String owner= dto.getOwner();
		String name = dto.getName();
		String famousFor = dto.getFamousFor();
		long contactNo = dto.getContactNo();
		
		boolean validowner = false;
		boolean validName = false;
		boolean validfamousFor = false;
		boolean validcontactNo = false;
		if (owner != null && owner.length() > 3 && owner.length() < 10) {
			System.out.println("Id is valid");
			validName = true;
		} else {
			System.out.println("Id is Invalid");
			validName = false;
		}

		if (name != null && name.length() > 3 && name.length() < 10) {
			System.out.println("name is valid");
			validName = true;
		} else {
			System.out.println("name is Invalid");
			validName = false;
		}

		if (famousFor != null && famousFor.length() > 3 && famousFor.length() < 10) {
			System.out.println("brand is valid");
			validfamousFor = true;
		} else {
			System.out.println("brand is Invalid");
			validfamousFor = false;
		}

		if (contactNo != 0 && contactNo > 0 && contactNo < 250) {
			System.out.println("brand is valid");
			validcontactNo = true;
		} else {
			System.out.println("seat is Invalid");
			validcontactNo = false;
		}

		if (validowner && validName && validfamousFor && validcontactNo) {
			System.out.println("DTO is valid " + dto);
			boolean saved = bakeryRepository.save(dto);
			System.out.println("Save success " + saved);
			return saved;
		}

		System.out.println("DTO is Invalid,cannot save");
		throw new InvalidTheaterDataException();
	}
}
