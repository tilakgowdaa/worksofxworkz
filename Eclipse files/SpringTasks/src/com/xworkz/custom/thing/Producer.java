package com.xworkz.custom.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	@Autowired
	private Assistant assistant;
	@Autowired
	private Company company;

	public Producer() {
		System.out.println("Created Producer using default const...");
	}
	
	public void check() {
		System.out.println(this.assistant.hashCode()+" "+this.company.hashCode());
	}
}
