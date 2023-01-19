package com.xworkz.Resort.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Resort.configuration.SpringConfiguration;
import com.xworkz.Resort.dto.ResortDTO;
import com.xworkz.Resort.service.ResortService;

public class ResortRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ResortService service = container.getBean(ResortService.class);
		boolean ref=service.validateAndSave(new ResortDTO());
		System.out.println(ref);
	}

}
