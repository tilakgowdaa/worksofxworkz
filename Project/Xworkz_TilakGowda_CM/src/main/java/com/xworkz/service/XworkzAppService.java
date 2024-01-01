package com.xworkz.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.dto.XworkzAppDto;

public interface XworkzAppService {

	Set<ConstraintViolation<XworkzAppDto>> validate(XworkzAppDto xworkzAppDto);

	long emailCountService(String email);
	
	long mobileCountService(String mobileNo);
	
	long userIdCountService(String userId);

	boolean saveService(XworkzAppDto xworkzAppDto);
}
