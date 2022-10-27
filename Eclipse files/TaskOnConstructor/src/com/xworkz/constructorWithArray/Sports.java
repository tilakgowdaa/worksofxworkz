package com.xworkz.constructorWithArray;

public class Sports {
	public String ubisoft;
	public char type;
	public String uniralEngine;
	public int noOfGames;
	public boolean gameForAdults;
	public String[] allGames;
	public String[] characterNames;
	public String[] playersNames;
	public double[] gamesPrice;
	public long[] noOfBuyers;
	public String[] missions;

	public Sports(String ubisoft, char type, String uniralEngine, int noOfGames, boolean gameForAdults,String[] allGames, String[] characterNames, String[] playersNames, double[] gamesPrice, long[] noOfBuyers,
			String[] missions) {

		this.ubisoft = ubisoft;
		this.type = type;
		this.uniralEngine = uniralEngine;
		this.noOfGames = noOfGames;
		this.gameForAdults = gameForAdults;
		this.allGames = allGames;
		this.characterNames = characterNames;
		this.playersNames = playersNames;
		this.gamesPrice = gamesPrice;
		;
		this.noOfBuyers = noOfBuyers;
		this.missions = missions;

	}

	public void display() {

		System.out.println(this.ubisoft);
		System.out.println(this.type);
		System.out.println(this.uniralEngine);
		System.out.println(this.noOfGames);
		System.out.println(this.gameForAdults);

		for (int i = 0; i < allGames.length; i++) {
			String ref1 = this.allGames[i];
			System.out.println(play1);
		}

		for (int i = 0; i < characterNames.length; i++) {
			String ref2 = this.characterNames[i];
			System.out.println(play2);
		}

		for (int i = 0; i < playersNames.length; i++) {
			String ref3 = this.playersNames[i];
			System.out.println(ref3);
		}

		for (int i = 0; i < gamesPrice.length; i++) {
			double ref4 = this.gamesPrice[i];
			System.out.println(ref4);
		}

		for (int i = 0; i < noOfBuyers.length; i++) {
			long ref5 = this.noOfBuyers[i];
			System.out.println(ref5);
		}

		for (int i = 0; i < missions.length; i++) {
			String ref6 = this.missions[i];
			System.out.println(ref6);
		}

	}
}
