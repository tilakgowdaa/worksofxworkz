package com.xworkz.example1;

public class Example6 {

	public static void main(String[] args) {
		int n=4;
		for (int i = 1; i <= n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print("");
			}
			for (int k = 1; k <=i; k++) {
				if(k==2) {
					System.out.print("two ");
				}
				else {
					System.out.print(k+" ");
				}
				
			}
			System.out.println("");
		}
	}

}
