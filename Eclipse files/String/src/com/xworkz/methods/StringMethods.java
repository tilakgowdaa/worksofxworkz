package com.xworkz.methods;

public class StringMethods {
	public static void main(String[] args) {

		String ref1 = "HELLO";
		System.out.println(ref1);
		System.out.println(System.lineSeparator());
		ref1 = ref1 + " MADAM";
		String ref2 = ref1.concat(",Hi");
		System.out.println(ref2);
		System.out.println(System.lineSeparator());

		char ref3 = ref1.charAt(1);
		System.out.println(ref3);
		System.out.println(System.lineSeparator());

		int ref4 = ref1.codePointAt(1);
		System.out.println(ref4);
		System.out.println(System.lineSeparator());

		int ref5 = ref1.codePointBefore(1);
		System.out.println(ref5);
		System.out.println(System.lineSeparator());

		int ref6 = ref1.codePointCount(1, 4);
		System.out.println(ref6);
		System.out.println(System.lineSeparator());

		int ref7 = ref2.compareTo(ref1);
		System.out.println(ref7);
		System.out.println(System.lineSeparator());

		boolean ref8 = ref1.contains("HE");
		System.out.println(ref8);
		System.out.println(System.lineSeparator());

		boolean ref9 = ref1.contentEquals("HELLO MADAM");
		System.out.println(ref9);
		System.out.println(System.lineSeparator());

		boolean ref10 = ref1.endsWith("M");
		System.out.println(ref10);
		System.out.println(System.lineSeparator());

		int ref11 = ref1.hashCode();
		System.out.println(ref11);
		System.out.println(System.lineSeparator());

		int ref12 = ref1.indexOf(2);
		System.out.println(ref12);
		System.out.println(System.lineSeparator());

		String ref13 = ref1.intern();
		System.out.println(ref13);
		System.out.println(System.lineSeparator());

		boolean ref14 = ref1.isEmpty();
		System.out.println(ref14);
		System.out.println(System.lineSeparator());

		int ref15 = ref1.lastIndexOf(2);
		System.out.println(ref15);
		System.out.println(System.lineSeparator());

		boolean ref16 = ref1.matches("HELLO MADAM");
		System.out.println(ref16);
		System.out.println(System.lineSeparator());

		String ref17 = ref1.replace('H', 'A');
		System.out.println(ref17);
		System.out.println(System.lineSeparator());

		int ref18 = ref1.length();
		System.out.println(ref18);
		System.out.println(System.lineSeparator());

		String ref19 = ref1.replace("MADAM", "SIR");
		System.out.println(ref19);
		System.out.println(System.lineSeparator());

		String ref20 = ref1.replaceAll("HELLO", "HI");
		System.out.println(ref20);
		System.out.println(System.lineSeparator());

		boolean ref21 = ref1.startsWith("HE");
		System.out.println(ref21);
		System.out.println(System.lineSeparator());

		boolean ref22 = ref1.startsWith("HELLO", 0);
		System.out.println(ref22);
		System.out.println(System.lineSeparator());

		char[] ref23 = ref1.toCharArray();
		System.out.println(ref23);
		System.out.println(System.lineSeparator());

		String ref24 = ref1.toLowerCase();
		System.out.println(ref24);
		System.out.println(System.lineSeparator());

		String ref25 = ref24.toUpperCase();
		System.out.println(ref25);
	}
}
