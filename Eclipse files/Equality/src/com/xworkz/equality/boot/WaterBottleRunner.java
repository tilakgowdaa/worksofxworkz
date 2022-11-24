package com.xworkz.equality.boot;

import com.xworkz.equality.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		WaterBottle bottle = new WaterBottle();
		bottle.setPrice(100);
		bottle.setCapacity(1);
		bottle.setCompany("genetic");
		bottle.setFlexible(false);
		bottle.setTransparent(false);
		bottle.setForChildren(true);
		bottle.setColor("blue");
		bottle.setCapType("thread");
		bottle.setShape("round");
		bottle.setMaterial("Plastic");

		WaterBottle bottle1 = new WaterBottle(200, 2, "grant", true, true, "rectangle", false, null, "lid", "steel");
		System.out.println(bottle1);
		
		boolean same=bottle.equals(bottle1);
		System.out.println(same);
	}

}
