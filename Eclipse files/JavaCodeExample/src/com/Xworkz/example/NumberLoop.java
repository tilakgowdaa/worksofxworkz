package com.Xworkz.construct;

public class NumberLoop{
	
	public static void num() {
	for(int i=0;i<5;i++) {
		System.out.print(i);
	}
	}
	
	public static void num1() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
	
	public static void num2() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
	
	public static void num3() {
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
	
	public static void num4() {
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
	
	public static void num5() {
		for(int i=5;i>0;i--) {
			for(int j=i;j<5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void num6() {
		for(int i=0;i>0;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
	
}
