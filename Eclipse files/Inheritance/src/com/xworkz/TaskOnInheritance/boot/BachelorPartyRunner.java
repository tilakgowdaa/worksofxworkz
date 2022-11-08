package com.xworkz.TaskOnInheritance.boot;

import com.xworkz.TaskOnInheritance.BachelorParty.BachelorParty;
import com.xworkz.TaskOnInheritance.BachelorParty.FriendsParty;

public class BachelorPartyRunner {
	public static void main(String[] args) {
		BachelorParty party=new FriendsParty("Bangalore","Glenlivet", 15);
		System.out.println(party.location);
		System.out.println(party.brand);
		System.out.println(party.noOfPeoples);
	}
}
