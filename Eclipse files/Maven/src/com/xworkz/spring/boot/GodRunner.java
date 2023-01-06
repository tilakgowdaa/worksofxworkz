package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.things.*;

public class GodRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(God.class);
		God ref=applicationContext.getBean(God.class);
		System.out.println(ref);
	}

}
