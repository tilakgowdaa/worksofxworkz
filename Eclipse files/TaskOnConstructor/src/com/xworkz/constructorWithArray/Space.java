package com.xworkz.constructorWithArray;

public class Space {
	public String Planet;
	public char type;
	public String galaxyName;
	public int positionOfPlanet;
	public boolean livingExist;
	public String[] planets;
	public String[] galaxies;
	public String[] naturalSatellite;
	public double[] planetsWeights;
	public long[] noNaturalSatellite;
	public String[] missions;

	public Space(String Planet, char type, String galaxyName, int positionOfPlanet, boolean livingExist,String[] planets, String[] galaxies, String[] naturalSatellite, double[] planetsWeights,
			long[] noNaturalSatellite, String[] missions) {

		this.Planet = Planet;
		this.type = type;
		this.galaxyName = galaxyName;
		this.positionOfPlanet = positionOfPlanet;
		this.livingExist = livingExist;
		this.planets = planets;
		this.galaxies = galaxies;
		this.naturalSatellite = naturalSatellite;
		this.planetsWeights = planetsWeights;
		this.noNaturalSatellite = noNaturalSatellite;
		this.missions = missions;

	}

	public void display() {

		System.out.println(this.Planet);
		System.out.println(this.type);
		System.out.println(this.galaxyName);
		System.out.println(this.positionOfPlanet);
		System.out.println(this.livingExist);

		for (int i = 0; i < planets.length; i++) {
			String ref1 = this.planets[i];
			System.out.println(ref1);
		}

		for (int i = 0; i < galaxies.length; i++) {
			String ref2 = this.galaxies[i];
			System.out.println(ref2);
		}

		for (int i = 0; i < naturalSatellite.length; i++) {
			String ref3 = this.naturalSatellite[i];
			System.out.println(ref3);
		}

		for (int i = 0; i < planetsWeights.length; i++) {
			double ref4 = this.planetsWeights[i];
			System.out.println(ref4);
		}

		for (int i = 0; i < noNaturalSatellite.length; i++) {
			long ref5 = this.noNaturalSatellite[i];
			System.out.println(ref5);
		}

		for (int i = 0; i < missions.length; i++) {
			String ref6 = this.missions[i];
			System.out.println(ref6);
		}

	}

}
