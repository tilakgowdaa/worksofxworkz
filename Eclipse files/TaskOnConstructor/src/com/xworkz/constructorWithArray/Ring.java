package com.xworkz.constructorWithArray;

public class Ring {
	public String[] type;
	public String[] gender;
	public String[] pattern;
	public boolean gold;
	public boolean stone;
	public String[] duplicateType;
	public String[] color;
	public int size;
	public int quantity;
	public boolean children;
	public int price;
	
	public Ring(String[] type,String[] gender,String[] pattern,boolean gold,boolean stone,String[] duplicateType,String[] color,int size,int quantity,boolean children,int price)
	{
		this.type=type;
		this.gender=gender;
		this.pattern=pattern;
		this.gold=gold;
		this.stone=stone;
		this.duplicateType=duplicateType;
		this.color=color;
		this.size=size;
		this.quantity=quantity;
		this.children=children;
		this.price=price;
	}
	public void display(){
		System.out.println(this.size);
		System.out.println(this.quantity);
		System.out.println(this.children);
		System.out.println(this.price);
	
		for (int i = 0; i < type.length; i++) {
			String string = type[i];
			System.out.println(string);
		}
		for (int i = 0; i < gender.length; i++) {
			String string = gender[i];
			System.out.println(string);
		}
		for (int i = 0; i < pattern.length; i++) {
			String string = pattern[i];
			System.out.println(string);
		}
		System.out.println(this.gold);
		System.out.println(this.stone);
		for (int i = 0; i < duplicateType.length; i++) {
			String string = duplicateType[i];
			System.out.println(string);
		}
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		
	}

}

