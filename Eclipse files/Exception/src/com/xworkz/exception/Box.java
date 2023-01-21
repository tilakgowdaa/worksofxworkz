package com.xworkz.exception;

public class Box {

	private String string;
	
	public void printString(String string) {
		if(string.isEmpty()) {
			throw new NothingIsThereException();
		}else {
			System.out.println(string);
		}
	}
}
