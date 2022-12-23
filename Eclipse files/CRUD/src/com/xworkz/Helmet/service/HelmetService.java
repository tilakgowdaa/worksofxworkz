package com.xworkz.Helmet.service;

import com.xworkz.Helmet.dto.HelmetDTO;

public interface HelmetService {
	boolean validateAndSave(HelmetDTO dto);
}
