package com.Xworkz.example;

public class Pharmacy {
	public static String name;
	public static int gstNo;
	
	public static void firstMethod() {
		System.out.println("without parameter,without retuen type");
	}
	
	public static String secondMethod() {
		System.out.println("without parameter,with return type");
		return name;
	}
	
	public static void thirdMethod(String name) {
		System.out.println("with parameter, without return type");
		
	}
	
	public static int fourthMethod(int gstNo) {
		System.out.println("with parameter, with return type");
		return gstNo;
	}
	
	
	
	
}
