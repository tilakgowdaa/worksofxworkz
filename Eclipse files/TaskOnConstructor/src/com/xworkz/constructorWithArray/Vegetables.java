package com.xworkz.constructorWithArray;
import com.xworkz.constructorWithArray.*;
public class Vegetables {
	public String[] name;
	public boolean fresh;
	public String[] roundVeg;
	public String[] LongVeg;
	public int quantity;
	public int quality;
	public String[] color;
	public String[] taste;
	public String[] cost;
	public boolean buy;
	
	public Vegetables(String[] name,boolean fresh,String[] roundVeg,String[] LongVeg,int quantity,int quality,String[] color,String[] taste,String[] cost,boolean buy){
		this.name=name;
		this.fresh=fresh;
		this.roundVeg=roundVeg;
		this.LongVeg=LongVeg;
		this.quantity=quantity;
		this.quality=quality;
		this.color=color;
		this.taste=taste;
		this.cost=cost;
		this.buy=buy;
	}
	
	public void displayDetails()
	{
		System.out.println(this.fresh);
		for (int i = 0; i < name.length; i++) {
			String string = name[i];
			System.out.println(string);
		}
		for (int i = 0; i < roundVeg.length; i++) {
			String string = roundVeg[i];
			System.out.println(string);
		}
		for (int i = 0; i < LongVeg.length; i++) {
			String string = LongVeg[i];
			System.out.println(string);
		}
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		for (int i = 0; i < taste.length; i++) {
			String string = taste[i];
			System.out.println(string);
		}
		for (int i = 0; i < cost.length; i++) {
			String string = cost[i];
			System.out.println(string);
		}
		System.out.println(this.quantity);
		System.out.println(this.quality);
		System.out.println(this.buy);
	}

}
}
