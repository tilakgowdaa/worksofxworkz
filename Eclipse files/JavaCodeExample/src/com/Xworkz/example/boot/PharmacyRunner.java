package com.Xworkz.example.boot;

import com.Xworkz.example.Pharmacy;

public class PharmacyRunner {

	public static void main(String[] args) {
		Pharmacy.firstMethod();
		Pharmacy.secondMethod();
		Pharmacy.thirdMethod("Om");
		int ref=Pharmacy.fourthMethod(182374);
		System.out.println(ref);
	}

}
