package com.xworkz.TaskOnEncapsulation.boot;

import com.xworkz.TaskOnEncapsulation.Pant;
import com.xworkz.TaskOnEncapsulation.PantInsidePackage;

public class PantRunner {

	public static void main(String[] args) {
		Pant pant=new Pant();
		PantInsidePackage pantin=new PantInsidePackage();
		pantin.use(pant);
		System.out.println(pant.getBrand());
	}

}
