package com.xworkz.TaskOnEncapsulation.boot;

import com.xworkz.TaskOnEncapsulation.Shirt;
import com.xworkz.TaskOnEncapsulation.ShirtInsidePackage;

public class ShirtRunner {

	public static void main(String[] args) {
		ShirtInsidePackage shirtIn = new ShirtInsidePackage();
		Shirt shirt = new Shirt();
		shirtIn.use(shirt);
		System.out.println(System.lineSeparator());
		System.out.println(shirt.getBrand());
		System.out.println(shirt.getColor());
		System.out.println(shirt.getNoOfButton());
		System.out.println(shirt.getPrice());
		System.out.println(shirt.getSize());
		System.out.println(shirt.getSizeInNo());
		System.out.println(shirt.isLightColor());
		System.out.println(shirt.isLooksGood());
		System.out.println(shirt.isFullSleeve());
		System.out.println(shirt.isHalfSleeve());
		System.out.println(shirt.isSleeveless());
	}

}
