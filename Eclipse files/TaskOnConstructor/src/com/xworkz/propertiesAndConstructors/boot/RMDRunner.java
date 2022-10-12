package com.xworkz.propertiesAndConstructors.boot;
import com.xworkz.propertiesAndConstructors.*;
public class RMDRunner {

	public static void main(String[] args) {
		RMD ref1=new RMD();
		System.out.println(ref1.name);
		System.out.println(ref1.founder);
		System.out.println(ref1.startedYear);
		System.out.println(ref1.price);
		System.out.println(ref1.mftPlace);
		System.out.println(ref1.noOfIngredients);
		System.out.println(ref1.liscenceNo);
		System.out.println(ref1.batchNo);
		System.out.println(ref1.mftDate);
		
		ref1.smellsGood=false;
		ref1.transportType="Truck";
		ref1.causes="health issues";
		ref1.peopleAffected=5362732;
		ref1.goodForHealth=false;
		ref1.founderDob="12/2/1934";
		ref1.suppliesAlloverIndia=true;
		ref1.suppliesAlloverWorld=false;
		ref1.peopleOpinion="Taste good,bad";
		
		System.out.println(ref1.smellsGood);
		System.out.println(ref1.transportType);
		System.out.println(ref1.causes);
		System.out.println(ref1.peopleAffected);
		System.out.println(ref1.goodForHealth);
		System.out.println(ref1.founderDob);
		System.out.println(ref1.suppliesAlloverIndia);
		System.out.println(ref1.suppliesAlloverWorld);
		System.out.println(ref1.peopleAffected);
		
		
	}

}
