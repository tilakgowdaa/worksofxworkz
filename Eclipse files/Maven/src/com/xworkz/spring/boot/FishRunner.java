package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.things.*;

public class FishRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Fish.class);
		Fish ref=applicationContext.getBean(Fish.class);
		System.out.println(ref);
	}

}
