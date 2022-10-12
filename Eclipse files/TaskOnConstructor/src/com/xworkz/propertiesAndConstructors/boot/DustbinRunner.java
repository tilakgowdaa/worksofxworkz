package com.xworkz.propertiesAndConstructors.boot;

import com.xworkz.propertiesAndConstructors.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) {
		Dustbin ref1=new Dustbin();
		System.out.println(ref1.thingName);
		System.out.println(ref1.material);
		System.out.println(ref1.mftBy);
		System.out.println(ref1.Width);
		System.out.println(ref1.height);
		System.out.println(ref1.Size);
		System.out.println(ref1.mftPlace);
		System.out.println(ref1.plantNo);
		System.out.println(ref1.color);
		
		
		ref1.liscenceNo=2412;
		ref1.designAvailable=true;
		ref1.designs="round,square";
		ref1.autoOpen=false;
		ref1.mftDate="12/3/12";
		ref1.reviews="Good quality,nice color";
		ref1.rating=4;
		ref1.qualityGrade=89;
		ref1.supplier="Om suppliers";
		
		System.out.println(ref1.liscenceNo);
		System.out.println(ref1.designAvailable);
		System.out.println(ref1.designs);
		System.out.println(ref1.autoOpen);
		System.out.println(ref1.mftDate);
		System.out.println(ref1.reviews);
		System.out.println(ref1.rating);
		System.out.println(ref1.qualityGrade);
		System.out.println(ref1.supplier);
		
		
	}

}
