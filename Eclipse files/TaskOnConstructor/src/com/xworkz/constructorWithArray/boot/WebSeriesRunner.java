package com.xworkz.constructorWithArray.boot;

import com.xworkz.constructorWithArray.WebSeries;

public class WebSeriesRunner {

	public static void main(String[] args) {
		String[] seriesName = { "Game Of Thrones", "House Of The Dragon", "13 Reasons Why", "Money Hiest" };
		String[] episodeNames = { "Dragon World", "Kill All Walkers", "Knights Watch" };
		String[] characterNames = { "Aegon ", "Veserys", "Rhaneyra", "Clay Jhonson" };
		double[] budget = { 200045435.0, 1500656.0, 450045546.0 };
		long[] noOfSeasons = { 1, 79, 14 };
		String[] musicNames = { "Danerys", "Aegon", "Title song" };

		WebSeries webSeries = new WebSeries("House Of The Dragon", 'A', "Matt Smith ", 12, false, seriesName,
				episodeNames, characterNames, budget, noOfSeasons, musicNames);

		webSeries.display();

	}

}
