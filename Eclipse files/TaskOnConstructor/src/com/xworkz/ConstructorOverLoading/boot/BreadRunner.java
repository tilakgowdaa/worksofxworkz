package com.xworkz.ConstructorOverLoading.boot;

import com.xworkz.ConstructorOverLoading.Bread;

public class BreadRunner {

	public static void main(String[] args) {
		Bread ref = new Bread();
		System.out.println(ref.type);

		Bread ref1 = new Bread("dog");
		System.out.println(ref1.type);
		
		Bread ref2=new Bread("Brown bread", "Round");
		System.out.println(ref2.type+" "+ref2.shape);
		
		Bread ref3=new Bread("Wheet", "square",35d);
		System.out.println(ref3.type+" "+ref3.shape+" "+ref3.price);
		
		Bread ref4=new Bread("Oats","rectangle",40d,2);
		System.out.println(ref4.type+" "+ref4.shape+" "+ref4.price+" "+ref4.companyName);
		
		Bread ref5=new Bread(50d, 4);
		System.out.println(ref5.price+" "+ref5.quantity);
		
		Bread ref6=new Bread(5, "parle");
		System.out.println(ref6.quantity+" "+ref6.companyName);

	}
}
