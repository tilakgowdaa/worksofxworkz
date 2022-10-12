package com.xworkz.propertiesAndConstructors.boot;
import com.xworkz.propertiesAndConstructors.*;
public class TeaRunner {

	public static void main(String[] args) {
		System.out.println("main Started");
		
		Tea ref1=new Tea();
		System.out.println("name : "+ref1.name);
		System.out.println("type : "+ref1.type);
		System.out.println("color : "+ref1.color);
		System.out.println("flavour : "+ref1.flavour);
		System.out.println("brand : "+ref1.brand);
		System.out.println("mftDate"+ref1.mftDate);
		System.out.println("expDate"+ref1.expDate);
		System.out.println("price"+ref1.price);
		System.out.println("mftPlace"+ref1.mftPlace);
		
		ref1.transport="Truck";
		ref1.stock=true;
		ref1.supplier="OM suppliers";
		ref1.batchNo=1023;
		ref1.taxPercent=18.23;
		ref1.noOfIngredients=4;
		ref1.discountAvailable=true;
		ref1.discountPercent=5.0;
		ref1.plantNo=102;
		
		System.out.println("transport : "+ref1.transport);
		System.out.println("stock : "+ref1.stock);
		System.out.println("supplier : "+ref1.supplier);
		System.out.println("batchNo : "+ref1.batchNo);
		System.out.println("taxPercent : "+ref1.taxPercent);
		System.out.println("noOfIngredient : "+ref1.noOfIngredients);
		System.out.println("discountAvailable : "+ref1.discountAvailable);
		System.out.println("discountPercent : "+ref1.discountPercent);
		System.out.println("plantNo : "+ref1.plantNo);
		
		System.out.println("main Ended");
		
		
		
	}

}
