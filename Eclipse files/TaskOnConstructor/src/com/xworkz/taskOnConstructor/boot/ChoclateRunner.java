package com.xworkz.taskOnConstructor.boot;

import com.xworkz.taskOnConstructor.Choclate;

public class ChoclateRunner {

	public static void main(String[] args) {
	System.out.println("main started");
	Choclate ref1=new Choclate();
	System.out.println(ref1.name);
	System.out.println(ref1.brand);
	System.out.println(ref1.price);
	System.out.println(ref1.flavour);
	
	System.out.println("updated data");
	
	ref1.name="Dairy Milk";
	ref1.brand="Cadbury";
	ref1.price=100;
	ref1.flavour="Nuts";
			
	System.out.println(ref1.name);
	System.out.println(ref1.brand);
	System.out.println(ref1.price);
	System.out.println(ref1.flavour);
	
	
	
	System.out.println("main ended");
	}

}
