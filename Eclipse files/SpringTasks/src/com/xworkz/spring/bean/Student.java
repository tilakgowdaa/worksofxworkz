package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	@Qualifier("studentName")
	private String name;
	@Autowired
	@Qualifier("varsha")
	private byte age;
	@Autowired
	@Qualifier("standard")
	private short grade;
	@Autowired
	@Qualifier("no")
	private int rollNo;
	@Autowired
	@Qualifier("mobile")
	private long phNo;
	@Autowired
	@Qualifier("etthara")
	private float height;
	@Autowired
	@Qualifier("thuuka")
	private double weight;
	@Autowired
	@Qualifier("sec")
	private char section;
	@Autowired
	@Qualifier("result")
	private boolean pass;

	public Student() {
		System.out.println("Created Student...");
	}

	public String getName() {
		return name;
	}

	public byte getAge() {
		return age;
	}

	public short getGrade() {
		return grade;
	}

	public int getRollNo() {
		return rollNo;
	}

	public long getPhNo() {
		return phNo;
	}

	public float getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public char getSection() {
		return section;
	}

	public boolean isPass() {
		return pass;
	}

}
