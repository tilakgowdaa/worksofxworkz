package com.xworkz.WebMvc.component;

import org.springframework.stereotype.Component;

@Component
public class TestingMvc {
	public TestingMvc() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
