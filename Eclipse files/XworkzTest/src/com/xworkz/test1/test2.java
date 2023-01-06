package com.xworkz.test1;

public class test2 {
	public int timmyPetals;
	public int sarahPetals;

	static boolean find(int timmyPetals, int sarahPetals) {
		if (timmyPetals % 2 == 0) {
			if (sarahPetals % 2 != 0) {
				System.out.println("They are in love");
				return true;
			} else {
				System.out.println("They are not in love");
				return false;
			}

		} else if (timmyPetals % 2 != 0) {
			if (sarahPetals % 2 == 0) {
				System.out.println("They are in love");
				return true;
			} else {
				System.out.println("They are not in love");
				return false;
			}

		}

		return false;
	}

}
