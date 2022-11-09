package com.xworkz.taskOnInheritance.boot;

import com.xworkz.taskOnInheritance.DJ.Dj;
import com.xworkz.taskOnInheritance.DJ.DjForGanapathi;

public class DjRunner {

	public static void main(String[] args) {
		Dj dj=new DjForGanapathi("Dj Manjoo", "Rajajinagar", "8:00 PM");
		System.out.println(dj.name);
		System.out.println(dj.showLocation);
		System.out.println(dj.timings);
	}

}
