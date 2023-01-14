package com.xworkz.custom.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.custom.configuration.CustomConfiguration;
import com.xworkz.custom.thing.Location;
import com.xworkz.custom.thing.Movie;

public class CustomRunner {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(CustomConfiguration.class);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		
		
		Movie ref=container.getBean(Movie.class);
		System.out.println(ref);
		ref.check();
	}
}
