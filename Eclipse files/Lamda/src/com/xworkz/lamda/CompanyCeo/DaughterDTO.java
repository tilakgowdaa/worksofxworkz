package com.xworkz.lamda.CompanyCeo;

public class DaughterDTO {
	private String name;
	private long moblieNo;
	private int age;
	private boolean committed;
	private boolean alive;

	public DaughterDTO() {
		super();
	}

	public DaughterDTO(String name, long moblieNo, int age, boolean committed, boolean alive) {
		super();
		this.name = name;
		this.moblieNo = moblieNo;
		this.age = age;
		this.committed = committed;
		this.alive = alive;
	}

	@Override
	public int hashCode() {
		return 22;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DaughterDTO) {
				DaughterDTO dto = (DaughterDTO) obj;
				if (dto.name.equals(this.name)) {
					System.out.println("Name is same : " + this.name);
				}
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", moblieNo=" + moblieNo + ", age=" + age + ", committed=" + committed
				+ ", alive=" + alive + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMoblieNo() {
		return moblieNo;
	}

	public void setMoblieNo(long moblieNo) {
		this.moblieNo = moblieNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommitted() {
		return committed;
	}

	public void setCommitted(boolean committed) {
		this.committed = committed;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
