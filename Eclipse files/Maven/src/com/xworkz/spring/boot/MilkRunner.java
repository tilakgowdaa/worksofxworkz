package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.things.*;

public class MilkRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Milk.class);
		Milk ref=applicationContext.getBean(Milk.class);
		System.out.println(ref);
	}

}
