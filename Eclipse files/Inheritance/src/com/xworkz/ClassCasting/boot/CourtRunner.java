package com.xworkz.ClassCasting.boot;

import com.xworkz.ClassCasting.Court.Court;
import com.xworkz.ClassCasting.Court.DistrictCourt;
import com.xworkz.ClassCasting.Court.HighCourt;
import com.xworkz.ClassCasting.Court.SupremeCourt;

public class CourtRunner {

	public static void main(String[] args) {
		System.out.println("Court Started");
		Court court = new Court();
		System.out.println(court.country);
		System.out.println(court.Type);

		System.out.println(System.lineSeparator());
		System.out.println("DistrictCourt Started");
		Court court3 = new DistrictCourt();
		DistrictCourt district = (DistrictCourt) court3;
		System.out.println(district.isMale);
		System.out.println(district.place);
		System.out.println(district.country);
		System.out.println(district.Type);

		System.out.println(System.lineSeparator());
		System.out.println("HighCourt started");
		Court court1 = new HighCourt();
		HighCourt highCourt = (HighCourt) court1;
		System.out.println(highCourt.color);
		System.out.println(highCourt.noOfJudges);
		System.out.println(highCourt.country);
		System.out.println(highCourt.Type);

		System.out.println(System.lineSeparator());
		System.out.println("SupremeCourt Started");
		Court court2 = new SupremeCourt();
		SupremeCourt supreme = (SupremeCourt) court2;
		System.out.println(supreme.judgeName);
		System.out.println(supreme.noOfPillers);
		System.out.println(supreme.country);
		System.out.println(supreme.Type);

	}

}
