package com.xworkz.taskOnInheritance.boot;

import com.xworkz.taskOnInheritance.Catering.Catering;
import com.xworkz.taskOnInheritance.Catering.WeddingCatering;

public class CateringRunner {

	public static void main(String[] args) {
		Catering catering = new WeddingCatering("Xworkz", 10, true);
		System.out.println(catering.name);
		System.out.println(catering.inOfWorkers);
		System.out.println(catering.tastesGood);

	}
}
