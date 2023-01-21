package com.xworkz.exception;

public class NothingIsThereException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Nothing is there...";
	}
}
