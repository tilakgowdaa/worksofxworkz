package com.xworkz.taskOnConstructor.boot;

import com.xworkz.taskOnConstructor.Song;

public class SongRunner {

	public static void main(String[] args) {
	System.out.println("main started");
	Song ref1=new Song();
	System.out.println(ref1.name);
	System.out.println(ref1.language);
	System.out.println(ref1.lyricst);
	System.out.println(ref1.singer);
	System.out.println(ref1.type);
	
	System.out.println("updated data");
	
	ref1.name="ninade nenapu dinavu manadalli";
	ref1.language="Kannada";
	ref1.lyricst="Chi Uday Shankar";
	ref1.singer="P B Srinivas";
	ref1.type="feeling";
	
	System.out.println(ref1.name);
	System.out.println(ref1.language);
	System.out.println(ref1.lyricst);
	System.out.println(ref1.singer);
	System.out.println(ref1.type);
	
	System.out.println("main ended");
	}

}
