package com.xworkz.taskOnConstructor.boot;

import com.xworkz.taskOnConstructor.Bus;

public class BusRunner {

	public static void main(String[] args) {
	System.out.println("main Started");
	Bus ref1=new Bus();
	System.out.println("First no : "+ref1.num);
	System.out.println("First starting location : "+ref1.starting);
	System.out.println("First destination : "+ref1.destination);
	
	ref1.num=201;
	ref1.starting="Malleshwaram";
	ref1.destination="Jalahalli";
	
	System.out.println("updated no : "+ref1.num);
	System.out.println("updated starting location : "+ref1.starting);
	System.out.println("updated destination : "+ref1.destination);
	
	
	
	System.out.println("main Ended");
	}
	
	

}
