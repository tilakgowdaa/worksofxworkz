package com.xworkz.constructorWithArray;

class Books {
	public String BookName;
	public String[] BookType;
	public String[] authors;
	public String[] BookBrand;
	public int quantity;
	public float quality;
	public boolean printed;
	public boolean blank;
	public String[] pageType;
	public String[] bindType;
	public String[] pageNum;
	
	public Books(String BookName,String[] BookType,String[] authors,String[] BookBrand,int quantity,float quality,boolean printed,boolean blank, String[] pageType,String[] bindType,String[] pageNum)
	{
		this.BookName=BookName;
		this.BookType=BookType;
		this.authors=authors;
		this.BookBrand=BookBrand;
		this.quantity=quantity;
		this.quality=quality;
		this.printed=printed;
		this.blank=blank;
		this.pageType=pageType;
		this.bindType=bindType;
		this.pageNum=pageNum;
	}
	public void displayDetails()
	{
		System.out.println(this.BookName);
		for (int i = 0; i < BookType.length; i++) {
			String string = BookType[i];
			System.out.println(string);
		}
		for (int i = 0; i < authors.length; i++) {
			String string = authors[i];
			System.out.println(string);
		}
		for (int i = 0; i < BookBrand.length; i++) {
			String string = BookBrand[i];
			System.out.println(string);
		}
		for (int i = 0; i < pageType.length; i++) {
			String string = pageType[i];
			System.out.println(string);
		}
		for (int i = 0; i < bindType.length; i++) {
			String string = bindType[i];
			System.out.println(string);
		}
		for (int i = 0; i < pageNum.length; i++) {
			String string = pageNum[i];
			System.out.println(string);
		}
		System.out.println(this.quantity);
		System.out.println(this.quality);
		System.out.println(this.printed);
		System.out.println(this.blank);
	}

}

