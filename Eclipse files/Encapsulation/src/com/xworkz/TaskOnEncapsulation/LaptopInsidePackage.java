package com.xworkz.TaskOnEncapsulation;

public class LaptopInsidePackage {
	public String otherBrand="lenovo";
	public Laptop laptop;

	public void use(Laptop laptop) {
		laptop.setLaptop("Dell", "Al124", "Intel", "I3", "Intel", 2019, 256, 40000, 4, 100, 3);
		System.out.println(otherBrand);
		System.out.println(laptop.brand);
		System.out.println(laptop.modelName);
		System.out.println(laptop.processorBrand);
		System.out.println(laptop.processorName);
		System.out.println(laptop.graphicProcessor);
		System.out.println(laptop.launchYear);
		System.out.println(laptop.capacityOfSSD);
		System.out.println(laptop.price);
		System.out.println(laptop.ram);
		System.out.println(laptop.batteryBackUp);
		System.out.println(laptop.getWarranty());
	}
}
