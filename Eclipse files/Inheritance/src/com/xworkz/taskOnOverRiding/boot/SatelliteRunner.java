package com.xworkz.taskOnOverRiding.boot;

import com.xworkz.taskOnOverRiding.Moon;
import com.xworkz.taskOnOverRiding.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		Satellite satellite=new Moon();
		satellite.showOff();
	}

}
