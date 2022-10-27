package com.xworkz.constructorWithArray;

public class Subjects {

	public String name;
	public String type;
	public String invented;
	public int types;
	public boolean freeToLearn;
	public String[] typesOfSubjects;
	public String[] typesOfExams;
	public String[] typesOfMarks;
	public double[] fee;
	public long[] totalStudentsInCountry;
	public String[] countryNames;

	public Subjects(String name, String type, String invented, int types, boolean freeToLearn, String[] typesOfSubjects,String[] typesOfExams, String[] typesOfMarks, double[] fee, long[] totalStudentsInCountry,String[] countryNames) {
		this.name = name;
		this.type = type;
		this.invented = invented;
		this.types = types;
		this.freeToLearn = freeToLearn;
		this.typesOfSubjects = typesOfSubjects;
		this.typesOfExams = typesOfExams;
		this.typesOfMarks = typesOfMarks;
		this.fee = fee;
		this.totalStudentsInCountry = totalStudentsInCountry;
		this.countryNames = countryNames;

	}

	public void display() {

		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.invented);
		System.out.println(this.types);
		System.out.println(this.freeToLearn);

		for (int i = 0; i < typesOfSubjects.length; i++) {

			String ref1 = this.typesOfSubjects[i];
			System.out.println(ref1);
		}

		for (int i = 0; i < typesOfExams.length; i++) {
			String ref2 = this.typesOfExams[i];
			System.out.println(ref2);
		}


		for (int i = 0; i < typesOfMarks.length; i++) {
			String ref3 = this.typesOfMarks[i];
			System.out.println(ref3);
		}


		for (int i = 0; i < fee.length; i++) {
			double play4 = this.fee[i];
			System.out.println(play4);
		}


		for (int i = 0; i < totalStudentsInCountry.length; i++) {
			long ref5 = this.totalStudentsInCountry[i];
			System.out.println(ref5);
		}

		for (int i = 0; i < countryNames.length; i++) {
			String ref6 = this.countryNames[i];
			System.out.println(ref6);

		}

	}

}
