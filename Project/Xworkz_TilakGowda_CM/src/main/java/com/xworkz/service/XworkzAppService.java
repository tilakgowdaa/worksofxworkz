package com.xworkz.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.dto.XworkzAppDto;

public interface XworkzAppService {

	Set<ConstraintViolation<XworkzAppDto>> validate(XworkzAppDto xworkzAppDto);

	List<XworkzAppDto> findAllService();

	boolean saveService(XworkzAppDto xworkzAppDto);
}
