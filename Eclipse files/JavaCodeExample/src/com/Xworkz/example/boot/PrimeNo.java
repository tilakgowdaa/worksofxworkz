package com.Xworkz.example.boot;

public class PrimeNo {
public static void main(String[] args) {
	int no=12;
	String res="prime No";
	
	for(int i=2;i<no;i++) {
		if(no%i==0) {
		res="Not a Prime No";
			break;
		}
		
		}
	System.out.println(res);
	}
}

