package com.xworkz.constructorWithArray.boot;
import com.xworkz.constructorWithArray.*;
public class BooksRunner {

	public static void main(String[] args) {
		String[] BookType= {"written","blank","newBook","oldBook","poetry","notes"};
		String[] authors= {"vikramSeth","ChetanBhagat","ArundhatiRoy","AmitavGhosh"};
		String[] BookBrand= {"classmate","vidhya","vikky"};
		String[] pageType= {"white","buff","a4sheet","ruled","unruled"};
		String[] bindType= {"thin","thick","long","short"};
		String[] pageNum= {"50page","150page","200pages"};
		
		Books books=new Books("Notes", BookType, authors, BookBrand, 7, 4.4f, false, true, pageType, bindType, pageNum);
		books.displayDetails();
	}
}
