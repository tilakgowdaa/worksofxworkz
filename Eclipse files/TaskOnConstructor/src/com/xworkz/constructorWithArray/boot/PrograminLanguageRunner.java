package com.xworkz.constructorWithArray.boot;

import com.xworkz.constructorWithArray.ProgramingLanguage;

public class PrograminLanguageRunner {

	public static void main(String[] args) {
		String[] placeNames = { "JAVA", "JAVA Script", "Advance JAVA", "C++" };
		String[] placeLocation = { "Web application", "Apps Development", "Developing games" };
		String[] members = { "Aviansh ", "Manoj", "Uday", "Sandeep" };
		double[] price = { 500.0, 1500.0, 2000.0 };
		long[] totalUserOtherCountry = { 13458, 794543, 1455354 };
		String[] countryNames = { "India", "Russia", "Japan" };

		ProgramingLanguage programingLanguage = new ProgramingLanguage("JAVA", "Code", "USA", 1, false, placeNames,
				placeLocation, members, price, totalUserOtherCountry, countryNames);

		programingLanguage.display();

	}

}
