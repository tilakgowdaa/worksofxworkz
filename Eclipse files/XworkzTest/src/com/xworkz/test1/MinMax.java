package com.xworkz.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MinMax {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(45,333,76,29,900,23,900,23,474,654,29,454));
		System.out.println("min : "+Collections.min(collection));
		System.out.println("max : "+Collections.max(collection));
	}
}
