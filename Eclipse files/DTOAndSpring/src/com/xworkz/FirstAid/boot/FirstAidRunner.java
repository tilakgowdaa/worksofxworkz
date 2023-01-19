package com.xworkz.FirstAid.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.FirstAid.configuration.SpringConfiguration;
import com.xworkz.FirstAid.dto.FirstAidDTO;
import com.xworkz.FirstAid.service.FirstAidServiceImpl;

public class FirstAidRunner {

	public static void main(String[] args) {
		 ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		 FirstAidServiceImpl service=applicationContext.getBean(FirstAidServiceImpl.class);
		  boolean ref=service.validateAndSave(new FirstAidDTO());
		 System.out.println(ref);
	}

}
