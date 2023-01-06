package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.things.*;

public class ApplicationRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Application.class);
		Application ref=applicationContext.getBean(Application.class);
		System.out.println(ref);
	}

}
