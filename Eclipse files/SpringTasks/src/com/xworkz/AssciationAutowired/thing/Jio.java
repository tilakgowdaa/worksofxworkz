package com.xworkz.crocodile.things;

import org.springframework.stereotype.Component;

import com.xworkz.crocodile.interfac.Provider;
@Component
public class Jio implements Provider {
	
	public Jio() {
		System.out.println("Created jio no-args const");
	}

	@Override
	public void connect() {
		System.out.println("overring connect by Jio");
	}

}
