package com.xworkz.ClassCasting.boot;

import com.xworkz.ClassCasting.Jail.*;


public class JailRunner {

	public static void main(String[] args) {
		System.out.println("Jail Started");
		Jail jail=new Jail();
		System.out.println(jail.name);
		System.out.println(jail.place);
		
		System.out.println(System.lineSeparator());
		System.out.println("Central Jail Started");
		Jail jail1=new CentralJail();
		CentralJail central=(CentralJail) jail1;
		System.out.println(central.duration);
		System.out.println(central.punishment);
		System.out.println(central.name);
		System.out.println(central.place);
		
		System.out.println(System.lineSeparator());
		System.out.println("Juvenile Jail Started");
		Jail jail2=new JuvenileJail();
		JuvenileJail juvenile=(JuvenileJail) jail2;
		System.out.println(juvenile.accussName);
		System.out.println(juvenile.duration);
		System.out.println(juvenile.name);
		System.out.println(juvenile.place);
		
		System.out.println(System.lineSeparator());
		System.out.println("District Jail Started");
		Jail jail3=new DistrictJail();
		DistrictJail district=(DistrictJail) jail3;
		System.out.println(district.districtName);
		System.out.println(district.noOfAccuss);
		System.out.println(district.name);
		System.out.println(district.place);
		
		
	}

}
