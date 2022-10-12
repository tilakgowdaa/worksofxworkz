package com.xworkz.propertiesAndConstructors.boot;
import com.xworkz.propertiesAndConstructors.*;
public class CigaretteRunner {

	public static void main(String[] args) {
		System.out.println("main started");
		Cigarette ref1=new Cigarette();
		System.out.println(ref1.name);
		System.out.println(ref1.color);
		System.out.println(ref1.price);
		System.out.println(ref1.mftPlace);
		System.out.println(ref1.mftDate);
		System.out.println(ref1.expDate);
		System.out.println(ref1.distributors);
		System.out.println(ref1.transportType);
		System.out.println(ref1.suppliers);
		
		ref1.peopleHarmed=98765432;
		ref1.peopleDied=56473829;
		ref1.tax=28;
		ref1.dicount=10;
		ref1.noOfRecovered=123;
		ref1.deathRate=89;
		ref1.liscenceNo=41778;
		ref1.noOfPlants=67;
		ref1.available=true;
		
		System.out.println(ref1.peopleHarmed);
		System.out.println(ref1.peopleDied);
		System.out.println(ref1.tax);
		System.out.println(ref1.dicount);
		System.out.println(ref1.noOfRecovered);
		System.out.println(ref1.deathRate);
		System.out.println(ref1.liscenceNo);
		System.out.println(ref1.noOfPlants);
		System.out.println(ref1.available=true);
		
		System.out.println("main Ended");
	}

}
