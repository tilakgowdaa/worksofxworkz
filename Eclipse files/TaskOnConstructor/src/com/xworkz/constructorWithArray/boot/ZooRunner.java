package com.xworkz.constructorWithArray.boot;
import com.xworkz.constructorWithArray.*;
public class ZooRunner {

	public static void main(String[] args) {
		
		String[] animalName= {"Tiger","Lion","Zeebra"};
		int[] age= {10,12,11};
		String[] workers= {"ram","sham","bheem"};
		String [] food= {"grass","meat","grains"};
		String[] equipment= {"broom","water tank","cleaning machine"};
		int[] staffSalaries= {19999,10280,82110};
		
		Zoo zoo=new Zoo("Bangalore zoo", 50, "Bangalore", "Kempe Gowda", 2022, animalName, age, workers, food, equipment, staffSalaries);
		
		zoo.displayDetails();
		
		
		
	}

}
