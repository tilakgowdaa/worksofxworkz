package com.xworkz.coding;

public class Fabinacci {
	public static void main(String[] args) {
		int n=6;
		int f=0;
		int s=1;
		int t;
		
		System.out.println(f);
		System.out.println(s);
		for (int i = 3; i <=n; i++) {
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}
	}
}
