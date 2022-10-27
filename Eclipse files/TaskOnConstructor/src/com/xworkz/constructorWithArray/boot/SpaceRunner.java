package com.xworkz.constructorWithArray.boot;

import com.xworkz.constructorWithArray.Space;

public class SpaceRunner {

	public static void main(String[] args) {
		String[] planets = { "Sun", "Earth", "Jupitor", "Neptune" };
		String[] galaxies = { "Milky Way Galaxy", "Black Eye Galaxy", "WhirlPool  Galaxy" };
		String[] naturalSatellite = { "Moon", "Titan", "Phobos", "Europa" };
		double[] planetsWeights = { 200045435.0, 1500656.0, 450045546.0 };
		long[] noNaturalSatellite = { 1, 79, 14 };
		String[] missions = { "Mangalyan", "Chandrayan", "Chandrayan 2" };

		Space space = new Space("Earth", 'E', "Milky Way Galaxy", 3, false, planets, galaxies, naturalSatellite,
				planetsWeights, noNaturalSatellite, missions);

		space.display();

	}
}
