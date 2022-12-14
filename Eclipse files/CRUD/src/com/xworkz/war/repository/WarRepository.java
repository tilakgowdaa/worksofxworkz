package com.xworkz.war.repository;

import java.time.LocalDateTime;

import com.xworkz.war.dto.WarDTO;

public interface WarRepository {

	boolean create(WarDTO dto);

	default int total() {
		return 0;
	}
	
	 WarDTO findByStartedBy(String StartedBy);
	 
	 WarDTO findByStartedByAndStartedWith(String StartedBy,String StartedWith);
	 
	 WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime Date);
	 
	 WarDTO findByStartDateLesserThanOrEqualTo(LocalDateTime Date);
	 
	// WarDTO findByStartDateAndEndDate(LocalDateTime start,LocalDateTime end);
}
