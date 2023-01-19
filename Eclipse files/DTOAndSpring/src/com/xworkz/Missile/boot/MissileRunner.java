package com.xworkz.Missile.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Missile.configuration.SpringConfiguration;
import com.xworkz.Missile.dto.MissileDTO;
import com.xworkz.Missile.service.MissileServiceImpl;

public class MissileRunner {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileServiceImpl service= container.getBean(MissileServiceImpl.class);
		service.validateAndSave(new MissileDTO());
	}
}
