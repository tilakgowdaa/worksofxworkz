package com.xworkz.lamda.CompanyCeo;

import java.io.Serializable;

public class CompanyCeoDTO implements Serializable {
	private String name;
	private String company;
	private int age;
	private String country;
	private String qualification;
	private boolean married;
	private DaughterDTO daughterdto;

	public CompanyCeoDTO() {
		super();
	}

	public CompanyCeoDTO(String name, String company, int age, String country, String qualification, boolean married,
			DaughterDTO daughterdto) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualification = qualification;
		this.married = married;
		this.daughterdto = daughterdto;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CompanyCeoDTO) {
				CompanyCeoDTO dto = (CompanyCeoDTO) obj;
				if (dto.name.equals(this.name)) {
					System.out.println("Name is same : " + this.name);
				}
			}
		}

		return false;
	}

	@Override
	public int hashCode() {
		return 33;
	}

	@Override
	public String toString() {
		return "CompanyCeoDTO [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualification=" + qualification + ", married=" + married + ", daughterdto=" + daughterdto + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public DaughterDTO getDaughterdto() {
		return daughterdto;
	}

	public void setDaughterdto(DaughterDTO daughterdto) {
		this.daughterdto = daughterdto;
	}

}
