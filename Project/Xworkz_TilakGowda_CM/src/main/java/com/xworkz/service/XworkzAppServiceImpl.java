package com.xworkz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.XworkzAppDto;
import com.xworkz.entity.XworkzAppEntity;
import com.xworkz.repository.XworkzAppRepository;

@Service
public class XworkzAppServiceImpl implements XworkzAppService {
	@Autowired
	public XworkzAppRepository xworkzAppRepository;

	public XworkzAppServiceImpl() {
		System.out.println("Running XworkzAppServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<XworkzAppDto>> validate(XworkzAppDto xworkzAppDto) {
		System.out.println("Running validateAndSave ");
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<XworkzAppDto>> violation = validator.validate(xworkzAppDto);
		if (!violation.isEmpty()) {
			return violation;
		} else {
			return Collections.emptySet();
		}

	}

	@Override
	public List<XworkzAppDto> findAllService() {
		System.out.println("Running findAll");
		List<XworkzAppEntity> entity = this.xworkzAppRepository.findAll();
		List<XworkzAppDto> dtos = new ArrayList();
		for (XworkzAppEntity xworkzAppEntity : entity) {
			XworkzAppDto dto = new XworkzAppDto();
			dto.setUserId(xworkzAppEntity.getUserId());
			dto.setEmail(xworkzAppEntity.getEmail());
			dto.setMobileNo(xworkzAppEntity.getMobileNo());
			dto.setPassword(xworkzAppEntity.getPassword());
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public boolean saveService(XworkzAppDto xworkzAppDto) {
		System.out.println("Running saveService");
		XworkzAppEntity entity=new XworkzAppEntity();
		BeanUtils.copyProperties(xworkzAppDto, entity);
		this.xworkzAppRepository.save(entity);
		return true;
	}
}
