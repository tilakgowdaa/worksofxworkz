package com.xworkz.TaskOnInheritance.boot;

import com.xworkz.TaskOnInheritance.Marriage.*;

public class MarriageRunner {
	public static void main(String[] args) {
		Marriage marriage = new ArrangeMarriage("24/4/2030", "Bangalore", 1);
		System.out.println(marriage.date);
		System.out.println(marriage.venue);
		System.out.println(marriage.noOfMarriage);
	}
}
