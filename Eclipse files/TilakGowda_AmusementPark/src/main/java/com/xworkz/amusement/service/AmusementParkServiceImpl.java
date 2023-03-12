package com.xworkz.amusement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.amusement.dto.AmusementParkDTO;
import com.xworkz.amusement.entity.AmusementParkEntity;
import com.xworkz.amusement.repository.AmusementParkRepository;

@Service
public class AmusementParkServiceImpl implements AmusementParkService {

	@Autowired
	private AmusementParkRepository amusementParkRepo;

	@Override
	public Set<ConstraintViolation<AmusementParkDTO>> validateAndSave(AmusementParkDTO amusementParkDTO) {
		System.out.println("Running validateAndSave Method");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AmusementParkDTO>> violation = validator.validate(amusementParkDTO);
		if (!violation.isEmpty() && violation != null) {
			System.out.println("Violation Occured");
			return violation;
		}
		System.out.println("No violation");
		AmusementParkEntity entity = new AmusementParkEntity();
		entity.setTicketType(amusementParkDTO.getTicketType());
		entity.setAddress(amusementParkDTO.getAddress());
		entity.setChildrenAllowed(amusementParkDTO.isChildrenAllowed());
		entity.setEntryFee(amusementParkDTO.getEntryFee());
		entity.setName(amusementParkDTO.getName());
		entity.setId(amusementParkDTO.getId());
		boolean saved = this.amusementParkRepo.save(entity);

		System.out.println("Saved: " + saved);
		return Collections.emptySet();

	}

	@Override
	public AmusementParkDTO findByID(int id) {
		System.out.println("Running FindByID");
		if (id > 0) {
			AmusementParkEntity entity = this.amusementParkRepo.findBy(id);
			if (entity != null) {
				System.out.println("Entity found:" + id);
				AmusementParkDTO amusementParkDTO = new AmusementParkDTO();
				amusementParkDTO.setId(entity.getId());
				amusementParkDTO.setAddress(entity.getAddress());
				amusementParkDTO.setChildrenAllowed(entity.isChildrenAllowed());
				amusementParkDTO.setEntryFee(entity.getEntryFee());
				amusementParkDTO.setName(entity.getName());
				amusementParkDTO.setTicketType(entity.getTicketType());
				return amusementParkDTO;
			}
		}
		return null;
	}

	@Override
	public List<AmusementParkDTO> findByName(String name) {
		System.out.println("Running findByName");
		if (name != null && !name.isEmpty()) {
			List<AmusementParkEntity> entities = this.amusementParkRepo.findBy(name);
			List<AmusementParkDTO> dtos = new ArrayList<AmusementParkDTO>();
			for (AmusementParkEntity amusementParkEntity : entities) {
				AmusementParkDTO amusementParkDTO = new AmusementParkDTO();
				amusementParkDTO.setAddress(amusementParkEntity.getAddress());
				amusementParkDTO.setChildrenAllowed(amusementParkEntity.isChildrenAllowed());
				amusementParkDTO.setEntryFee(amusementParkEntity.getEntryFee());
				amusementParkDTO.setName(amusementParkEntity.getName());
				amusementParkDTO.setTicketType(amusementParkEntity.getTicketType());
				amusementParkDTO.setId(amusementParkEntity.getId());
				dtos.add(amusementParkDTO);

			}
			System.out.println("Size of dtos:" + dtos.size());
			return dtos;
		} else {
			System.err.println("name is invalid");
			return null;
		}

	}

	@Override
	public Set<ConstraintViolation<AmusementParkDTO>> validateAndUpdate(AmusementParkDTO amusementParkDTO) {
		System.out.println("Running validateAndUpdate");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AmusementParkDTO>> violation = validator.validate(amusementParkDTO);
		if (!violation.isEmpty()) {
			System.out.println("Violation found");
			return violation;

		} else {
			System.out.println("No violation");
			AmusementParkEntity entity = new AmusementParkEntity();
			entity.setAddress(amusementParkDTO.getAddress());
			entity.setChildrenAllowed(amusementParkDTO.isChildrenAllowed());
			entity.setEntryFee(amusementParkDTO.getEntryFee());
			entity.setId(amusementParkDTO.getId());
			entity.setName(amusementParkDTO.getName());
			entity.setTicketType(amusementParkDTO.getTicketType());
			this.amusementParkRepo.update(entity);
			return Collections.emptySet();
		}
	}

	@Override
	public boolean validateAnddelete(int id) {
		System.out.println("Running Validateanddelete");
		if (id < 0) {
			return false;
		} else {
			boolean deleted = this.amusementParkRepo.delete(id);
			System.out.println("Deleted: " + deleted);
			return deleted;
		}

	}

	@Override
	public List<AmusementParkDTO> findAll() {
		System.out.println("Running findAll in sevice");
		List<AmusementParkEntity> entity = this.amusementParkRepo.findAll();
		List dtoList = new ArrayList<AmusementParkDTO>();
		for (AmusementParkEntity dtos : entity) {
			AmusementParkDTO dto = new AmusementParkDTO();
			dto.setAddress(dtos.getAddress());
			dto.setChildrenAllowed(dtos.isChildrenAllowed());
			dto.setEntryFee(dtos.getEntryFee());
			dto.setId(dtos.getId());
			dto.setName(dtos.getName());
			dto.setTicketType(dtos.getTicketType());
			dtoList.add(dto);
		}
		return dtoList;
	}

	@Override
	public List<AmusementParkDTO> validateAndfindByPrice(double entryFee) {
		System.out.println("Running validateAndfindByPrice");
		if (entryFee > 0) {
			List<AmusementParkEntity> entity = this.amusementParkRepo.findByPrice(entryFee);
			List<AmusementParkDTO> dto = new ArrayList<AmusementParkDTO>();
			for (AmusementParkEntity ent : entity) {
				AmusementParkDTO amusementParkDTO = new AmusementParkDTO();
				amusementParkDTO.setAddress(ent.getAddress());
				amusementParkDTO.setChildrenAllowed(ent.isChildrenAllowed());
				amusementParkDTO.setEntryFee(ent.getEntryFee());
				amusementParkDTO.setId(ent.getId());
				amusementParkDTO.setTicketType(ent.getTicketType());
				amusementParkDTO.setName(ent.getName());
				dto.add(amusementParkDTO);
			}
			return dto;

		}
		System.out.println("price is invalid");
		return null;
	}

	@Override
	public List<AmusementParkDTO> findByNameAndPrice(String name, double entryFee) {
		System.out.println("Running findByNameAndPrice in service");
		if (name != null && entryFee != 0) {
			List<AmusementParkEntity> entities = this.amusementParkRepo.findByNameAndPrice(name, entryFee);
			List<AmusementParkDTO> dtos = new ArrayList<AmusementParkDTO>();
			for (AmusementParkEntity amusementParkEntity : entities) {
				AmusementParkDTO amusementParkDTO = new AmusementParkDTO();
				amusementParkDTO.setAddress(amusementParkEntity.getAddress());
				amusementParkDTO.setChildrenAllowed(amusementParkEntity.isChildrenAllowed());
				amusementParkDTO.setEntryFee(amusementParkEntity.getEntryFee());
				amusementParkDTO.setName(amusementParkEntity.getName());
				amusementParkDTO.setTicketType(amusementParkEntity.getTicketType());
				amusementParkDTO.setId(amusementParkEntity.getId());
				dtos.add(amusementParkDTO);
			}
			return dtos;
		}
		System.out.println("Data not valid");
		return AmusementParkService.super.findByNameAndPrice(name, entryFee);
	}
}
