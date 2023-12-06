package com.xworkz;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,1,2};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("\t"+arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
				}
			}
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=-1) 
				System.out.print("\t"+arr[i]);
			
		}
	}

}
