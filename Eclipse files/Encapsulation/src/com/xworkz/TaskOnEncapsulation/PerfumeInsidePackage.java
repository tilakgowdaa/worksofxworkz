package com.xworkz.TaskOnEncapsulation;

public class PerfumeInsidePackage {
	public String otherBrand;
	public Perfume perfume;

	public void use(Perfume perfume) {
		perfume.setPerfume("Louis Vuitton", "Mille feux", "Bernard Arnault", "UK", 2000, "24/2/2019", "25/2/2022", true,
				200, "sweet", "Blue");

		System.out.println(perfume.brand);
		System.out.println(perfume.name);
		System.out.println(perfume.brandOwner);
		System.out.println(perfume.colour);
		System.out.println(perfume.price);
		System.out.println(perfume.quality);
		System.out.println(perfume.quantity);
		System.out.println(perfume.manufactureDate);
		System.out.println(perfume.manufactureCountry);
		System.out.println(perfume.expiryDate);
		System.out.println(perfume.fragrance);
	}
}
