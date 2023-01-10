package com.xworkz.Bean.boot;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Bean.configuration.SpringConfig;

public class SpringRunner {

	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfig.class);
		String[] beanName=spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanName) );
		
		Map ref=spring.getBean("pair",Map.class);
		System.out.println(ref);
		
		Collection<Integer> ref1=spring.getBean("collect", Collection.class);
		System.out.println(ref1);
				
		
		
		
		
	}

}
