package com.xworkz.taskOnConstructor.boot;

import com.xworkz.taskOnConstructor.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
	System.out.println("main started");
	DistrictCollector ref1=new DistrictCollector();
	System.out.println(ref1.name);
	System.out.println(ref1.age);
	System.out.println(ref1.district);
	System.out.println(ref1.batchNo);
	
	System.out.println("Updated Data");
	ref1.name="K Srinivas";
	ref1.age=45;
	ref1.district="Bangalore North";
	ref1.batchNo=2010;
	
	System.out.println(ref1.name);
	System.out.println(ref1.age);
	System.out.println(ref1.district);
	System.out.println(ref1.batchNo);
	
	System.out.println("main ended");
	}

}
