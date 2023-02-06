package com.Xworkz.example.boot;

import java.util.Scanner;

public class FibonacciRecursion {

	public static int fibo(int a) {
		if (a == 0) {
			return 0;
		} else if (a == 1 || a == 2) {
			return 1;
		} else {
			return fibo(a - 1) + fibo(a - 2);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the fib number ");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(fibo(i) + " ");
		}

	}
}
