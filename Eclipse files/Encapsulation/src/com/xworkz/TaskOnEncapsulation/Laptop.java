package com.xworkz.TaskOnEncapsulation;

public class Laptop {
	public String brand = "Dell";
	public String modelName = "Inspiron 3511";
	public String processorBrand = "Intel";
	public String processorName = "Core-i5";
	public String graphicProcessor = "Intel Integrated DDR4";
	public double launchYear = 2022;
	public double capacityOfSSD = 512;
	public double price = 35000;
	public int ram = 16;
	public int batteryBackUp = 6;
	public int warranty = 12;

	void setLaptop(String brand, String modelName, String processorBrand, String processorName, String graphicProcessor,
			double launchYear, double capacityOfSSD, double price, int ram, int batteryBackUp, int warranty) {
		this.brand = brand;
		this.modelName = modelName;
		this.processorBrand = processorBrand;
		this.processorName = processorName;
		this.graphicProcessor = graphicProcessor;
		this.launchYear = launchYear;
		this.capacityOfSSD = capacityOfSSD;
		this.price = price;
		this.ram = ram;
		this.batteryBackUp = batteryBackUp;
		this.warranty = warranty;
	}

	public String getBrand() {
		return brand;
	}

	public String getModelName() {
		return modelName;
	}

	public String getProcessorBrand() {
		return processorBrand;
	}

	public String getProcessorName() {
		return processorName;
	}

	public String getGraphicProcessor() {
		return graphicProcessor;
	}

	public double getLaunchYear() {
		return launchYear;
	}

	public double getCapacityOfSSD() {
		return capacityOfSSD;
	}

	public double getPrice() {
		return price;
	}

	public int getRam() {
		return ram;
	}

	public int getBatteryBackUp() {
		return batteryBackUp;
	}

	public int getWarranty() {
		return warranty;
	}

}
