package com.xworkz.crocodile.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.crocodile.interfac.Browser;
import com.xworkz.crocodile.interfac.Provider;

@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	public Chrome() {
		System.out.println("created chrome no-args const..");
	}

	@Override
	public void browse() {
		System.out.println("overriding browse...");
		provider.connect();
	}

}
