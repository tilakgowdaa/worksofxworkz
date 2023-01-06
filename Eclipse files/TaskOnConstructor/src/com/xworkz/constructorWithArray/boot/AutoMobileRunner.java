package com.xworkz.constructorWithArray.boot;
import com.xworkz.constructorWithArray.*;
public class AutoMobileRunner {

	public static void main(String[] args) {
		String[] bikeName = { "splender", "passion", "deluxe" };
		String[] companyLocation = { "banglore","chennai","pune" };
		String[] bikeLogo = { "Hero", "Deluxe", "Pro" };
		double[] price = { 109911.03, 129492.04, 138299.48 };
		long[] totalVehicleManufactured = { 19283423l };
		String[] companyOwnersName = {"Vikram S","Pawan Munjal"};
		
		AutoMobile autoMobile=new AutoMobile("Hero", 'P', "Splender", 499143, false, bikeName, companyLocation, bikeLogo, price, totalVehicleManufactured, companyOwnersName);
			autoMobile.displayDetails();
			
		
			
		}
	
	
		
	
	}


