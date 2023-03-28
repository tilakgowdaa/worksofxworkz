package com.Xworkz.example.boot;

public class FactorialNo {

	public static void main(String[] args) {
		int x = 5;
		int result = 1;
		for (int i = x; i > 1; i--) {
			result = result * i;
		}
		System.out.println(result);
	}

}
