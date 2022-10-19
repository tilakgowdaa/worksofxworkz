package com.xworkz.constructorWithArray;

public class Zoo {
	
	public String name;
	public int noOfAnimals;
	public String location;
	public String builtBy;
	public int builtYear;
	public String[] animalName;
	public int[] age;
	public String[] workers;
	public String [] food;
	public String[] equipment;
	public int[] staffSalaries;
	
	public Zoo(String name,int noOfAnimals,String location,String builtBy,int builtYear,String[] animalName,int[] age,String[] workers,String [] food,String[] equipment,int[] staffSalaries){
		
	
	this.name=name;
	this.noOfAnimals=noOfAnimals;
	this.location=location;
	this.builtBy=builtBy;
	this.builtYear=builtYear;
	this.animalName=animalName;
	this.age=age;
	this.workers=workers;
	this.food=food;
	this.equipment=equipment;
	this.staffSalaries=staffSalaries;
	}
	
	public void displayDetails() {
		System.out.println(this.name);
		System.out.println(this.noOfAnimals);
		System.out.println(this.location);
		System.out.println(this.builtBy);
		System.out.println(this.builtYear);
		System.out.println(System.lineSeparator());
		
		for(int i=0;i<this.animalName.length;i++) {
			String ref=this.animalName[i];
			System.out.println("Animal Name : "+ref);
		}
		
		for(int i=0;i<this.age.length;i++) {
			int ref1=this.age[i];
			System.out.println("Age : "+ref1);
		}
		
		for(int i=0;i<this.workers.length;i++) {
			String ref2=this.workers[i];
			System.out.println("workers : "+ref2);
		}
		
		for(int i=0;i<this.food.length;i++) {
			String ref3=this.food[i];
			System.out.println("food : "+ref3);
		}
		
		for(int i=0;i<this.equipment.length;i++) {
			String ref4=this.equipment[i];
			System.out.println("equipment : "+ref4);
		}
		
		for(int i=0;i<this.staffSalaries.length;i++) {
			int ref5=this.staffSalaries[i];
			System.out.println("staffSalaries : "+ref5);
		}
		
		
		
	}
	

}
