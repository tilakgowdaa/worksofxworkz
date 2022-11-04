package com.xworkz.TaskOnEncapsulation.boot;

import com.xworkz.TaskOnEncapsulation.*;

public class BagRunner {

	public static void main(String[] args) {
		BagInsidePackage bagIn = new BagInsidePackage();
		Bag bag = new Bag();
		bagIn.use(bag);
		System.out.println(bag.getBrand());

	}

}
