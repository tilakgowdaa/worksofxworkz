package com.xworkz.Helmet.dto;

import com.xworkz.Helmet.constant.Color;
import com.xworkz.Helmet.constant.Type;

public class HelmetDTO extends AbstractAuditDTO {
	private String brand;
	private Color color;
	private Type type;
	private Double price;

	public HelmetDTO() {
		super();
	}

	public HelmetDTO(String brand, Color color, Type type, Double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", color=" + color + ", type=" + type + ", price=" + price + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
