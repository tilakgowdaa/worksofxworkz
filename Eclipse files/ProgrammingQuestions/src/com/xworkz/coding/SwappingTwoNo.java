package com.xworkz.coding;

public class SwappingTwoNo {

	public static void main(String[] args) {
		//with extra variable
		int x = 10;
		int y = 20;
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println(x);
		System.out.println(y);
		
		
		//without extra variable
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
