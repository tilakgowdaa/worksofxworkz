package com.xworkz.war.repository;

import java.time.LocalDateTime;

import com.xworkz.war.dto.WarDTO;

public class WarRepositoryImpl implements WarRepository {
	private WarDTO[] warDto = new WarDTO[1];
	private int currentIndex = 0;

	@Override
	public boolean create(WarDTO dto) {
		System.out.println("Running craete of WarDTO " + dto);
		if (this.currentIndex >= this.warDto.length) {
			System.out.println("Size exceeded,cannot add");
			return false;
		}
		this.warDto[this.currentIndex] = dto;
		System.out.println("saved " + dto + " in the index " + this.currentIndex);
		this.currentIndex++;
		return true;
	}

	@Override
	public int total() {
		return this.currentIndex;

	}

	@Override
	public WarDTO findByStartedBy(String StartedBy) {
		System.out.println("running findByStartBy");
		for (WarDTO warDTO2 : warDto) {
			if (warDTO2 != null && warDTO2.getStartedBy().equals(StartedBy)) {
				System.out.println("DTO Matched " + warDTO2);
				return warDTO2;
			}
			
		}
		System.out.println("DTO not Matched");
		return null;

	}

	@Override
	public WarDTO findByStartedByAndStartedWith(String StartedBy, String StartedWith) {
		System.out.println("Running findByStartedByAndStartedWith ");
		for (WarDTO warDTO2 : warDto) {
			if (warDTO2 != null && warDTO2.getStartedBy().equals(StartedBy)
					&& warDTO2.getStartedWith().equals(StartedWith)) {
				System.out.println("DTO matched "+warDTO2);
				return warDTO2;
			}
		}
		System.out.println("DTO not matched");
		return null;
	}

	@Override
	public WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime Date) {
		System.out.println("Running findByStartDateGreaterThanOrEqualTo ");
		for (WarDTO warDTO2 : warDto) {
			if(warDTO2!=null && warDTO2.getStartDate().isAfter(Date)) {
				System.out.println("DTO matched "+warDTO2);
				return warDTO2;
			}
		}
		System.out.println("DTO not matched");
		return null;
	}
	
	@Override
	public WarDTO findByStartDateLesserThanOrEqualTo(LocalDateTime Date) {
		System.out.println("Running findByStartDateGreaterThanOrEqualTo ");
		for (WarDTO warDTO2 : warDto) {
			if(warDTO2!=null && warDTO2.getStartDate().isBefore(Date)) {
				System.out.println("DTO matched "+warDTO2);
				return warDTO2;
			}
		}
		System.out.println("DTO not matched");
		return null;
	}
	
	
	
	
	
	

}
