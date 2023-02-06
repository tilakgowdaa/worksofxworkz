package com.Xworkz.example.boot;

public class SecondLargest {

	public static void main(String[] args) {
		
	
	int arr[]= {20,38,29,93,91,47,43};
	int large=arr[0];
	int secondLarge=arr[0];
	
	System.out.println("The given array is :" );
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>large) {
			secondLarge=large;
			large=arr[i];
		}
		else if(arr[i]>secondLarge) {
			secondLarge=arr[i];
		}
	}
	System.out.println("Second largest:"+ secondLarge);
}
}