package com.xworkz.Helmet.boot;

import com.xworkz.Helmet.constant.Color;
import com.xworkz.Helmet.constant.Type;
import com.xworkz.Helmet.dto.HelmetDTO;
import com.xworkz.Helmet.repository.HelmetRepository;
import com.xworkz.Helmet.repository.HelmetRepositoryImpl;
import com.xworkz.Helmet.service.HelmetService;
import com.xworkz.Helmet.service.HelmetServiceImpl;

public class HelmetRunner {
	public static void main(String[] args) {
		HelmetDTO helmetDTO = new HelmetDTO("Ve", Color.White, Type.Sports, 1234D);
		HelmetRepository helmetRepository = new HelmetRepositoryImpl();
		HelmetService helmetService = new HelmetServiceImpl(helmetRepository);
		boolean success = helmetService.validateAndSave(helmetDTO);
		System.out.println("Success " + success);

	}
}
