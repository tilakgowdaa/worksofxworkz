package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class XworkzApplicationConfiguration {
	public XworkzApplicationConfiguration() {
		System.out.println("Running XworkzApplicationConfiguration");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Registering entityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Registering viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

}
