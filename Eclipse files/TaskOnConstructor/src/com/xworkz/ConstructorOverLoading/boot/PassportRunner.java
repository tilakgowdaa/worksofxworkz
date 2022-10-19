package com.xworkz.ConstructorOverLoading.boot;

import com.xworkz.ConstructorOverLoading.Passport;

public class PassportRunner {

	public static void main(String[] args) {
		Passport ref = new Passport();
		System.out.println(ref.number);

		Passport ref1 = new Passport(182736);
		System.out.println(ref1.number);

		Passport ref2 = new Passport(928347, "rocky");
		System.out.println(ref2.number + " " + ref2.name);

		Passport ref3 = new Passport(298373, "bhai", "12/11/1989");
		System.out.println(ref3.number + " " + ref3.name + " " + ref3.expDate);

		Passport ref4 = new Passport(12837, "garuda", "21/1/1988", "India");
		System.out.println(ref4.number + " " + ref4.name + " " + ref4.expDate + " " + ref4.country);

		Passport ref5 = new Passport(18278, "inaiad", "09/7/1988", "UK", "13/03/1990");
		System.out.println(
				ref5.number + " " + ref5.name + " " + ref5.expDate + " " + ref5.country + " " + ref5.issueDate);

		Passport ref6 = new Passport("reena");
		System.out.println(ref6.name);

		Passport ref7 = new Passport("chacha", "UAE");
		System.out.println(ref7.name + " " + ref7.country);

	}

}
