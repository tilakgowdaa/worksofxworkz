package com.xworkz.equality.boot;

import com.xworkz.equality.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		Paint paint=new Paint();
		paint.setCompany("Asian Paint");
		paint.setBrand("Asian Paint");
		paint.setColor("Black");
		paint.setPrice(500);
		paint.setQuality(true);
		paint.setMftDate("12/12/22");
		paint.setExpDate("12/12/24");
		paint.setTransportMode("truck");
		paint.setBatchNo("TN37819");
		paint.setRating(4);
		
		Paint paint1=new Paint("Nippon", "Nippon Paints", "Blue", 300, false, "9/2/13", "9/2/15", "ND28728", "train", 3);
		System.out.println(paint1.toString());
		
		boolean ref=paint.equals(paint1);
		System.out.println(ref);
		if(paint.getBrand().equals(paint1.getBrand()));
		System.out.println("Piant is same");
	}

}
