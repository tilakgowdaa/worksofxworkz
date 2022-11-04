package com.xworkz.TaskOnEncapsulation.boot;

import com.xworkz.TaskOnEncapsulation.Toothpaste;
import com.xworkz.TaskOnEncapsulation.ToothpasteInsidePackage;

public class ToothPasteRunner {

	public static void main(String[] args) {
		Toothpaste toothpaste = new Toothpaste();
		ToothpasteInsidePackage paste = new ToothpasteInsidePackage();
		paste.use(toothpaste);
		System.out.println(toothpaste.getColor());

	}

}
