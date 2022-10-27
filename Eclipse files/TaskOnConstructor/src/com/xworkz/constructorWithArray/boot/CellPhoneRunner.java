package com.xworkz.constructorWithArray.boot;
import com.xworkz.constructorWithArray.*;
public class CellPhoneRunner {

	public static void main(String[] args) {
		String[] mobileType= {"TouchScreen","keypad"};
		String[] brand= {"vivo","realme","redme","samsung","iphone"};
		String[] features= {"48MPCamera","5gbRam","128GbStorage"};
		String[] backCover= {"TransparentSilicone","PlasticCase","HybridBackCase","RubberCover","FlipCase"};
		String[] keypadMobileBrand= {"Samsung1200","Nokia3130","DizoStar500","lavaFlip"};
		String[] color= {"Red","White","silver"};
		
		CellPhone cellPhone=new CellPhone(mobileType, 4, brand, features, false, true, backCover, false, keypadMobileBrand, 1200, color);
		cellPhone.display();

	}

}
