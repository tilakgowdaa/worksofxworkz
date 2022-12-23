package com.xworkz.war.boot;

import java.time.LocalDateTime;

import com.xworkz.war.dto.WarDTO;
import com.xworkz.war.repository.WarRepository;
import com.xworkz.war.repository.WarRepositoryImpl;

public class WarDtoRunner {

	public static void main(String[] args) {
		

		WarDTO dto = new WarDTO();
		dto.setName("First battle of panipat");
		dto.setStartDate(LocalDateTime.of(1544, 2, 15, 3, 33));
		dto.setEndDate(LocalDateTime.of(1545, 4, 3, 3, 36));
		dto.setStartedBy("babur");
		dto.setStartedWith("Lodi dynasty");
		dto.setWonBy("mughal");
		dto.setNoOfDeaths(6000);
		dto.setCreatedBy("System");
		dto.setCreatedDate(LocalDateTime.now());
		WarRepository repo = new WarRepositoryImpl();
		repo.create(dto);
		System.out.println(dto.getCreatedBy());
		System.out.println(dto.getCreatedDate());

		System.out.println(System.lineSeparator());

		WarDTO dto1 = new WarDTO("Second battle of panipat", LocalDateTime.of(1556, 4, 23, 4, 43),
				LocalDateTime.of(1557, 4, 26, 5, 27), "Hemchandra V", "akbar", "Hemchandra V", 7893);
		repo.create(dto1);

		repo.findByStartedBy("bab");
		repo.findByStartedByAndStartedWith("babur", "Lodi dynasty");

	}
}
