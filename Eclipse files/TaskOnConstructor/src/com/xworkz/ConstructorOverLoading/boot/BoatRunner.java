package com.xworkz.ConstructorOverLoading.boot;

import com.xworkz.ConstructorOverLoading.Boat;

public class BoatRunner {

	public static void main(String[] args) {
		System.out.println("Note :");
		System.out.println("B-Black");
		System.out.println("W-White");
		System.out.println("P-Purple");
		
		Boat ref = new Boat();
		System.out.println(ref.name);

		Boat ref1 = new Boat("rocky");
		System.out.println(ref1.name);

		Boat ref2 = new Boat("garuda", 'B');
		System.out.println(ref2.name + " " + ref2.color);

		Boat ref3 = new Boat("adheera", 'W', "narachi");
		System.out.println(ref3.name + " " + ref3.color + " " + ref3.companyName);

		Boat ref4 = new Boat("chacha", 'P', "chai", "petrol");
		System.out.println(ref4.name + " " + ref4.color + " " + ref4.companyName + " " + ref4.type);

		Boat ref5 = new Boat("karavali", "mathsya");
		System.out.println(ref5.name + " " + ref5.companyName);

		Boat ref6 = new Boat("simha", "hibbani", "diesel");
		System.out.println(ref6.name + " " + ref6.companyName + " " + ref6.type);

		Boat ref7 = new Boat("huli", "kambani", "coal", "reena");
		System.out.println(ref7.name + " " + ref7.companyName + " " + ref7.type + " " + ref7.owner);

	}

}
