package com.xworkz.repository;

import java.util.List;

import com.xworkz.entity.XworkzAppEntity;

public interface XworkzAppRepository {
	List<XworkzAppEntity> findAll();

	boolean save(XworkzAppEntity xworkzAppEntity);
}
