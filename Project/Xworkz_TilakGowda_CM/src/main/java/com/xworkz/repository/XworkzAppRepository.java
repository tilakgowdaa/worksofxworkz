package com.xworkz.repository;

import java.util.List;

import com.xworkz.entity.XworkzAppEntity;

public interface XworkzAppRepository {
	long emailCount();
	
	long userIdCount();
	
	long mobileCount();

	boolean save(XworkzAppEntity xworkzAppEntity);
}
