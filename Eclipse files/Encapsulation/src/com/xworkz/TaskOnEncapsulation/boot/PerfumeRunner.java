package com.xworkz.TaskOnEncapsulation.boot;

import com.xworkz.TaskOnEncapsulation.Perfume;
import com.xworkz.TaskOnEncapsulation.PerfumeInsidePackage;

public class PerfumeRunner {

	public static void main(String[] args) {
			Perfume perfume=new Perfume();
			PerfumeInsidePackage perfumes=new PerfumeInsidePackage();
			perfumes.use(perfume);
			System.out.println(perfume.getBrandOwner());
	}

}
