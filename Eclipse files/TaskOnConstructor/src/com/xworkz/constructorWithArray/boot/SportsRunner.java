package com.xworkz.constructorWithArray.boot;

import com.xworkz.constructorWithArray.Sports;

public class SportsRunner {

	public static void main(String[] args) {
		String[] allGames = { "AssassinCreed", "Watch Dogs", "GTA 5", "Call Of Duty" };
		String[] characterNames = { "Edward", "Desmond", "Conner" };
		String[] playersNames = { "Avinash", "Laxmikant", "Karthik", "Chetan" };
		double[] gamesPrice = { 2000.0, 1500.0, 4500.0 };
		long[] noOfBuyers = { 5600000l, 7500000l, 6800000l };
		String[] missions = { "Docking", "Ship Destroying", "Eliminating the Leader" };

		Sports sports = new Sports("Crew", 'S', "God Of War", 70, false, allGames, characterNames, playersNames,
				gamesPrice, noOfBuyers, missions);

		sports.display();

	}

}
