package com.xworkz.crocodile.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.crocodile.configuration.CrocodileConfiguration;
import com.xworkz.crocodile.things.Chrome;
import com.xworkz.crocodile.things.FireBox;

public class CrocodileRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(CrocodileConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());
		
		Chrome chrome = container.getBean(Chrome.class);
		chrome.browse();
		FireBox firebox = container.getBean(FireBox.class);
		firebox.browse();
	}

}
