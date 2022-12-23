package com.xworkz.Theater.boot;

import com.xworkz.Theater.dto.TheaterDTO;
import com.xworkz.Theater.exception.InvalidTheaterDataException;
import com.xworkz.Theater.repository.TheaterRepository;
import com.xworkz.Theater.repository.TheaterRepositoryImpl;
import com.xworkz.Theater.service.TheaterService;
import com.xworkz.Theater.service.TheaterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) {
		TheaterDTO dto = new TheaterDTO("ID6734", "Orion", "Psacs", 32);
		TheaterDTO dto1 = new TheaterDTO("ID6734", "Orion", "Psccs", 32);
		TheaterDTO dto2 = new TheaterDTO("ID6734", "Orion", "Pdsdd", 32);

		TheaterRepository repository = new TheaterRepositoryImpl();
		TheaterService service = new TheaterServiceImpl(repository);
		try {
			System.out.println("Before calling validateAndSave in try");
			service.validateAndSave(dto);
			//service.validateAndSave(dto1);
			//service.validateAndSave(dto2);

			System.out.println("After calling validateAndSave in try");

		} catch (InvalidTheaterDataException e) {
			System.out.println("Exception handled");
		}

	}

}
