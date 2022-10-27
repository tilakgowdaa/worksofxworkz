package com.xworkz.constructorWithArray;

public class WebSeries {
	public String name;
	public char type;
	public String actorName;
	public int noOfActors;
	public boolean hit;
	public String[] seriesName;
	public String[] episodeNames;
	public String[] characterNames;
	public double[] budget;
	public long[] noOfSeasons;
	public String[] musicNames;

	public WebSeries(String name, char type, String actorName, int noOfActors, boolean hit, String[] seriesName,
			String[] episodeNames, String[] characterNames, double[] budget, long[] noOfSeasons, String[] musicNames) {
		this.name = name;
		this.type = type;
		this.actorName = actorName;
		this.noOfActors = noOfActors;
		this.hit = hit;
		this.seriesName = seriesName;
		this.episodeNames = episodeNames;
		this.characterNames = characterNames;
		this.budget = budget;
		;
		this.noOfSeasons = noOfSeasons;
		this.musicNames = musicNames;

	}

	public void display() {

		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.actorName);
		System.out.println(this.noOfActors);
		System.out.println(this.hit);

		System.out.println("Series Name");

		for (int i = 0; i < seriesName.length; i++) {
			String ref1 = this.seriesName[i];
			System.out.println(ref1);

		}

		for (int i = 0; i < episodeNames.length; i++) {
			String ref2 = this.episodeNames[i];
			System.out.println(ref2);

		}

		for (int i = 0; i < characterNames.length; i++) {
			String ref3 = this.characterNames[i];
			System.out.println(ref3);

		}

		for (int i = 0; i < budget.length; i++) {
			double ref4 = this.budget[i];
			System.out.println(ref4);

		}

		for (int i = 0; i < noOfSeasons.length; i++) {
			long ref5 = this.noOfSeasons[i];
			System.out.println(ref5);

		}

		for (int i = 0; i < musicNames.length; i++) {
			String ref6 = this.musicNames[i];
			System.out.println(ref6);

		}

	}
}
