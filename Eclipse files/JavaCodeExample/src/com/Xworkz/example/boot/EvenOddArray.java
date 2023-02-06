package com.Xworkz.example.boot;

public class EvenOddArray {
	static int[] number = { 10, 12, 13, 14, 46, 35, 64, 24, 63, 87 };
	static int evenNum;
	static int oddNum;

	public static void main(String args[]) {
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				evenNum++;
			} else {
				oddNum++;
			}
		}
		System.out.println("number of even : " + evenNum);
		System.out.println("number of odd : " + oddNum);
	}
}
