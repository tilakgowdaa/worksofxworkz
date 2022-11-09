package com.xworkz.taskOnOverRiding.boot;

import com.xworkz.taskOnOverRiding.Criminal;
import com.xworkz.taskOnOverRiding.Ravi;

public class CriminalRunner {

	public static void main(String[] args) {
		Criminal criminal=new Ravi();
		criminal.showOff();
	}

}
