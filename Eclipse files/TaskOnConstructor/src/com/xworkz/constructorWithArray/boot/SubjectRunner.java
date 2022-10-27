package com.xworkz.constructorWithArray.boot;

import com.xworkz.constructorWithArray.Subjects;

public class SubjectRunner {

	public static void main(String[] args) {
		String[] typesOfSubjects = { "Maths", "Physics", "Computer Science", "History" };
		String[] typesOfExams = { "Matrices", "Gravity", "Programming" };
		String[] typesOfMarks = { "Aryabhat", "C.V.Raman", "Charles Babej", "Mourya Empire" };
		double[] fee = { 34000.0, 150000.0, 2000000.0 };
		long[] totalStudentsInCountry = { 13458, 794543, 1455354 };
		String[] countryNames = { "India", "Russia", "USA" };

		Subjects subjects = new Subjects("JAVA", "Code", "USA", 1, false, typesOfSubjects, typesOfExams, typesOfMarks,
				fee, totalStudentsInCountry, countryNames);

		subjects.display();

	}
}
