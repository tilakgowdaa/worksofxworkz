package com.xworkz.patterns;

public class TandemloopTest {

	static int a = 4;

	public static void main(String[] args) {
	for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if ((j <= a - i + 1)) {
					System.out.print((i + j - 1) + "");

				}
	
	
		else {
					System.out.print((a - j + 1) + "");
				}

			}
			System.out.println();

		}
		
	}
}
