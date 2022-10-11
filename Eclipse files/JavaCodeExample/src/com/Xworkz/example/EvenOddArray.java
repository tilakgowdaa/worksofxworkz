package com.Xworkz.construct;

public class EvenOddArray {
	static int[] number={10,12,13,14,46,35,64,24,63,87};
	static int evenNum;
	static int oddNum;
	
	public static void checkOdd() {
		for(int i=0;i<number.length;i++) {
			if(number[i]%2==0) {
				System.out.println("number is even");
				evenNum++;
			}
			else {
				System.out.println("number is odd");
				oddNum++;
			}
		}
	}
	
	public static void numOfEvenOdd() {
		System.out.println("number of even : "+evenNum);
		System.out.println("number of odd : "+oddNum);
	}

}
