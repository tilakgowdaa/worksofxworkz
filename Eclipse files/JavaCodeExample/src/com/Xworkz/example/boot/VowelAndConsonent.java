package com.Xworkz.example.boot;

public class VowelAndConsonent {
	public static void main(String[] args) {
		String str = "TilakGowda111@gmail.com";
		int vowel=0;
		int consonent=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
			}else if(ch>='a'&& ch<='z' || ch>='A'&&ch<='Z'){
				consonent++;
			}
		}
		System.out.println(vowel);
		System.out.println(consonent);
	}
}
