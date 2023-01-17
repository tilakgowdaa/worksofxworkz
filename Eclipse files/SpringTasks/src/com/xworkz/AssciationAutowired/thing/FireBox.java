package com.xworkz.AssciationAutowired.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.AssciationAutowired.interfaces.Browser;
import com.xworkz.AssciationAutowired.interfaces.Provider;

@Component
public class FireBox implements Browser {
	@Autowired
	@Qualifier("jio")
	private Provider provider1;

	public FireBox() {
		System.out.println("Created fireBox no-args const...");
	}

	@Override
	public void browse() {
		System.out.println("override browse by fireBox..");
		provider1.connect();

	}

}
