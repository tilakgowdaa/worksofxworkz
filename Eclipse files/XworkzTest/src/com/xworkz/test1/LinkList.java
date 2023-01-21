package com.xworkz.test1;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(123);
		list.add(23);
		list.add(2354);

		list.forEach(ele -> System.out.println(ele));
		list.removeFirst();
		System.out.println("removed first");
		list.forEach(ele -> System.out.println(ele));
		list.removeLast();

		System.out.println("removed last");
		list.forEach(ele -> System.out.println(ele));

	}
}