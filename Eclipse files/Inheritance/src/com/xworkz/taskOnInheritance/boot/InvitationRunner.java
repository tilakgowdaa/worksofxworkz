package com.xworkz.taskOnInheritance.boot;

import com.xworkz.taskOnInheritance.Invitation.BirthdayInvitation;
import com.xworkz.taskOnInheritance.Invitation.Invitation;

public class InvitationRunner {
	public static void main(String[] args) {
		Invitation invite=new BirthdayInvitation("paper", 100, true);
		System.out.println(invite.type);
		System.out.println(invite.noOfCopies);
		System.out.println(invite.colorPrint);
	}
}
