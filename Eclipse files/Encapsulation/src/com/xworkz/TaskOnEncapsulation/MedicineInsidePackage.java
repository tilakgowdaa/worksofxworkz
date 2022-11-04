package com.xworkz.TaskOnEncapsulation;

public class MedicineInsidePackage {
	public String otherCompany = "para lab";
	public Medicine medicine;

	public void use(Medicine medicine) {
		System.out.println(otherCompany);
		medicine.setMedicine("dolo", 4, "dolo matre", "ragi ittu", "cipla", 40, true, "25/11/12", "23/12/33", false, 3);
		System.out.println(medicine.name);
		System.out.println(medicine.price);
		System.out.println(medicine.inKannada);
		System.out.println(medicine.combination);
		System.out.println(medicine.priceForSheet);
		System.out.println(medicine.availability);
		System.out.println(medicine.mftDate);
		System.out.println(medicine.expDate);
		System.out.println(medicine.forChildren);
		System.out.println(medicine.rating);
	}
	
}
