package com.programming.class1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListForCustomClasses {
	
	public static void main(String[] args) {
		
		List<Book> listBook = new ArrayList<>();
		
		Book b1 = new Book(123,"a", "b", "c", 10);
		Book b2 = new Book(133,"x", "y", "z", 130);
		Book b3 = new Book(153,"p", "q", "r", 190);
		
		listBook.add(b1);
		listBook.add(b1);
		listBook.add(b1);
		listBook.add(b3);
		listBook.add(b2);
		
		Iterator<Book> itr = listBook.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b.bookId + ":" + b.bookName + ":" + b.bookAuthor + ":" + b.bookAuthor + ":" + b.bookQuantity);
		}
	}

}
