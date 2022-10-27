package com.xworkz.constructorWithArray.boot;

import com.xworkz.constructorWithArray.*;

public class RingRunner {

	public static void main(String[] args) {
		String[] type = { "tennis", "pearl", "charm", "bangle" };
		String[] gender = { "female", "male" };
		String[] pattern = { "round", "ovul", "box", "plain" };
		String[] duplicateType = { "", "friendshipBand" };
		String[] color = { "gold", "silver", "platinum", "bronze" };

		Ring ring = new Ring(type, gender, pattern, true, false, duplicateType, color, 3, 22, true, 500);
		ring.display();

	}

}
