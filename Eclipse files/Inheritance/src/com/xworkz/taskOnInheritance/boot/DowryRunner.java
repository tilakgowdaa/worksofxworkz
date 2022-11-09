package com.xworkz.taskOnInheritance.boot;

import com.xworkz.taskOnInheritance.Dowry.Dowry;
import com.xworkz.taskOnInheritance.Dowry.DowryFromBride;

public class DowryRunner {

	public static void main(String[] args) {
		Dowry dowry=new DowryFromBride(false, false, 1961);
		System.out.println(dowry.taken);
		System.out.println(dowry.isLegal);
		System.out.println(dowry.prohibitionAct);
	}

}
