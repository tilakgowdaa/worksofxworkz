package com.xworkz.TaskOnEncapsulation.boot;

import com.xworkz.TaskOnEncapsulation.Laptop;
import com.xworkz.TaskOnEncapsulation.LaptopInsidePackage;

public class LaptopRunner {

	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		LaptopInsidePackage lap=new LaptopInsidePackage();
		lap.use(laptop);
		System.out.println(laptop.getCapacityOfSSD());
	}
}
