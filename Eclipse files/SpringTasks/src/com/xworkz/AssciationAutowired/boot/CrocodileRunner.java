package com.xworkz.AssciationAutowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.AssciationAutowired.configuration.CrocodileConfiguration;
import com.xworkz.AssciationAutowired.thing.Chrome;
import com.xworkz.AssciationAutowired.thing.FireBox;

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
