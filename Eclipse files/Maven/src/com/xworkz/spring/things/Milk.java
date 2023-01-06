package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Milk {
	public Milk() {
		System.out.println("Milk created by Spring");
	}
}
