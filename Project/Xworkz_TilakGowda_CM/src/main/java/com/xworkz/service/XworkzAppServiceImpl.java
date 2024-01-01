package com.xworkz.service;

import java.util.Collections;
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

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class XworkzAppServiceImpl implements XworkzAppService {
	@Autowired
	public XworkzAppRepository xworkzAppRepository;

	public XworkzAppServiceImpl() {
		log.info("Running XworkzAppServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<XworkzAppDto>> validate(XworkzAppDto xworkzAppDto) {
		log.info("Running validateAndSave ");
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<XworkzAppDto>> violation = validator.validate(xworkzAppDto);
		if (!violation.isEmpty()) {
			return violation;
		}
		if (!xworkzAppDto.getPassword().equals(xworkzAppDto.getConfirmPassword())) {
			return null;
		}
		if (this.xworkzAppRepository.emailCount() == 0 && this.xworkzAppRepository.mobileCount() == 0
				&& this.xworkzAppRepository.userIdCount() == 0) {
			this.saveService(xworkzAppDto);
		}
		return Collections.emptySet();

	}

	@Override
	public long emailCountService(String email) {
		log.info("Running emailCountService");
		long no = this.xworkzAppRepository.emailCount();
		return no;
	}

	@Override
	public long mobileCountService(String mobileNo) {
		log.info("Running mobileCountService");
		long no = this.xworkzAppRepository.mobileCount();
		return no;
	}

	@Override
	public long userIdCountService(String userId) {
		log.info("Running userIdCountService");
		long no = this.xworkzAppRepository.userIdCount();
		return no;
	}

	@Override
	public boolean saveService(XworkzAppDto xworkzAppDto) {
		log.info("Running saveService");
		XworkzAppEntity entity = new XworkzAppEntity();
		BeanUtils.copyProperties(xworkzAppDto, entity);
		this.xworkzAppRepository.save(entity);
		return true;
	}
}
