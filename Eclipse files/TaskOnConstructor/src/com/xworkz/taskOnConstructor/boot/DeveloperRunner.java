package com.xworkz.taskOnConstructor.boot;

import com.xworkz.taskOnConstructor.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
	System.out.println("main started");
	Developer ref1=new Developer();
	System.out.println(ref1.name);
	System.out.println(ref1.education);
	System.out.println(ref1.experience);
	System.out.println(ref1.salary);
	System.out.println(ref1.company);
	
	System.out.println("updated Data");
	
	ref1.name="Tilak Gowda H K";
	ref1.education="B E in Mechanical Engineering";
	ref1.experience=0;
	ref1.salary=12345;
	ref1.company="XYZ";
	
	System.out.println(ref1.name);
	System.out.println(ref1.education);
	System.out.println(ref1.experience);
	System.out.println(ref1.salary);
	System.out.println(ref1.company);
	
	System.out.println("main ended");
	}

}
