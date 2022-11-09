package com.xworkz.taskOnInheritance.boot;

import com.xworkz.taskOnInheritance.PreWeddingShoot.PreWeddingShoot;
import com.xworkz.taskOnInheritance.PreWeddingShoot.UnderWaterShoot;

public class PreWeddingShootRunner {

	public static void main(String[] args) {
		PreWeddingShoot shoot = new UnderWaterShoot("Maldives", 300000, "shiva");
		System.out.println(shoot.location);
		System.out.println(shoot.photographerName);
		System.out.println(shoot.price);
	}

}
