package com.xworkz.TaskOnEncapsulation.boot;

import com.xworkz.TaskOnEncapsulation.Medicine;
import com.xworkz.TaskOnEncapsulation.MedicineInsidePackage;

public class MedicineRunner {

	public static void main(String[] args) {
		Medicine medicine = new Medicine();
		MedicineInsidePackage med = new MedicineInsidePackage();
		med.use(medicine);

		System.out.println(medicine.getCompany());
	}

}
