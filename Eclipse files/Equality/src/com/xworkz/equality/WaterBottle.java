package com.xworkz.equality;

public class WaterBottle {
	private double price;
	private int capacity;
	private String company;
	private boolean transparent;
	private boolean flexible;
	private String shape;
	private boolean forChildren;
	private String Color;
	private String capType;
	private String material;

	public WaterBottle() {
		super();
		System.out.println("default const running");
	}

	public WaterBottle(double price, int capacity, String company, boolean transparent, boolean flexible, String shape,
			boolean forChildren, String color, String capType, String material) {
		super();
		this.price = price;
		this.capacity = capacity;
		this.company = company;
		this.transparent = transparent;
		this.flexible = flexible;
		this.shape = shape;
		this.forChildren = forChildren;
		Color = color;
		this.capType = capType;
		this.material = material;
	}

	public boolean equals(Object obj) {
		System.out.println("equals method runing");
		if(obj instanceof WaterBottle) {
			System.out.println("obj is WaterBottle");
			WaterBottle cast=(WaterBottle)obj;
			if(this.shape.equals(cast.shape) && this.material.equals(cast.material) && this.company.equals(cast.company)) {
				System.out.println("are same");
				return true;
			}
			else {
				System.out.println("not same");
				return false;
			}
		}
		else {
			System.out.println("obj is not WaterBottle");
			return false;
		}
	}
	@Override
	public String toString() {
		return "WaterBottle [price=" + price + ", capacity=" + capacity + ", company=" + company + ", transparent="
				+ transparent + ", flexible=" + flexible + ", shape=" + shape + ", forChildren=" + forChildren
				+ ", Color=" + Color + ", capType=" + capType + ", material=" + material + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isTransparent() {
		return transparent;
	}

	public void setTransparent(boolean transparent) {
		this.transparent = transparent;
	}

	public boolean isFlexible() {
		return flexible;
	}

	public void setFlexible(boolean flexible) {
		this.flexible = flexible;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public boolean isForChildren() {
		return forChildren;
	}

	public void setForChildren(boolean forChildren) {
		this.forChildren = forChildren;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getCapType() {
		return capType;
	}

	public void setCapType(String capType) {
		this.capType = capType;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
