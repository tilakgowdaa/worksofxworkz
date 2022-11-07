package com.xworkz.ClassCasting.boot;

import com.xworkz.ClassCasting.Doctor.*;

public class DoctorRunner {

	public static void main(String[] args) {
		System.out.println("Doctor Started");
		Doctor doctor = new Doctor();
		System.out.println(doctor.name);
		System.out.println(doctor.income);
		System.out.println(System.lineSeparator());
		
		System.out.println("Dentist Started");
		Doctor doctor1 = new Dentist();
		Dentist dentist = (Dentist) doctor1;
		System.out.println(dentist.hsptlName);
		System.out.println(dentist.fee);
		System.out.println(System.lineSeparator());

		System.out.println("Cardiologist Started");
		Doctor doctor2 = new Cardiologist();
		Cardiologist cardio = (Cardiologist) doctor2;
		System.out.println(cardio.experiance);
		System.out.println(cardio.availableTime);
		System.out.println(System.lineSeparator());
		
		System.out.println("EarNoseThroat Started");
		Doctor doctor3 = new EarNoseThroat();
		EarNoseThroat ent = (EarNoseThroat) doctor3;
		System.out.println(ent.hsptlName);
		System.out.println(ent.available);

	}

}
