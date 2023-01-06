package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.things.*;

public class ChocolateRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Chocolate.class);
		Chocolate ref=applicationContext.getBean(Chocolate.class);
		System.out.println(ref);
	}

}
