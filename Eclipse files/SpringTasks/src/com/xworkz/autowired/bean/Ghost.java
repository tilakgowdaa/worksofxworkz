package com.xworkz.autowired.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	private String name;
	private byte age;
	private short height;
	private double weight;
	private long phNo;
	private float noOfLegs;
	private int noOfHands;
	private boolean alive;
	private Gender gender;
	private LocalDate DoB;
	@Autowired
	@Qualifier("ghostDOD")
	private LocalDate DoD;
	@Autowired
	@Qualifier("ghostDress")
	private String dress;
	@Autowired
	@Qualifier("ghostColor")
	private String color;
	@Autowired
	@Qualifier("ghostEducation")
	private String education;
	@Autowired
	@Qualifier("ghostGradaute")
	private boolean graduate;
	@Autowired
	@Qualifier("ghostCollegeName")
	private String collegeName;
	@Autowired
	@Qualifier("ghostDrinksBlood")
	private boolean drinksBlood;
	@Autowired
	@Qualifier("ghostLivesIn")
	private String livesIn;
	@Autowired
	@Qualifier("ghostScaredOf")
	private String scaredOf;
	@Autowired
	@Qualifier("ghostDangerous")
	private boolean dangerous;

	public Ghost(@Qualifier("ghostName")String name, @Qualifier("ghostAge") byte age,
			@Qualifier("ghostHeigth") short height, @Qualifier("ghostWeight") double weight,
			@Qualifier("ghostPhNo") long phNo, @Qualifier("ghostNoOflegs") float noOfLegs,
			@Qualifier("ghostNoOfHands") int noOfHands, @Qualifier("ghostAlive") boolean alive,
			@Qualifier("ghostGender") Gender gender, @Qualifier("ghostDOB") LocalDate doB) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.phNo = phNo;
		this.noOfLegs = noOfLegs;
		this.noOfHands = noOfHands;
		this.alive = alive;
		this.gender = gender;
		DoB = doB;
	}

	public String getName() {
		return name;
	}

	public byte getAge() {
		return age;
	}

	public short getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public long getPhNo() {
		return phNo;
	}

	public float getNoOfLegs() {
		return noOfLegs;
	}

	public int getNoOfHands() {
		return noOfHands;
	}

	public boolean isAlive() {
		return alive;
	}

	public Gender getGender() {
		return gender;
	}

	public LocalDate getDoB() {
		return DoB;
	}

	public LocalDate getDoD() {
		return DoD;
	}

	public String getDress() {
		return dress;
	}

	public String getColor() {
		return color;
	}

	public String getEducation() {
		return education;
	}

	public boolean isGraduate() {
		return graduate;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public boolean isDrinksBlood() {
		return drinksBlood;
	}

	public String getLivesIn() {
		return livesIn;
	}

	public String getScaredOf() {
		return scaredOf;
	}

	public boolean isDangerous() {
		return dangerous;
	}

}
