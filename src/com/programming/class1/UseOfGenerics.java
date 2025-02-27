package com.programming.class1;

import java.util.ArrayList;
import java.util.List;

public class UseOfGenerics {
	
	public static void main(String[] args) {
		
		/* <> - generic where we are mentioning that this arraylist will only 
		and only entertain String type data */
		
		//used with collections, aka diamond operator
		
		List<String> listOfStr = new ArrayList<>();
		listOfStr.add("Z");
		listOfStr.add("X");
		listOfStr.add("Y");
		listOfStr.add("Y");
		
		for(int i = 0; i < listOfStr.size(); i++) {
			System.out.println(listOfStr.get(i) + " ");
		}
		
		List listOfStr2 = new ArrayList();
		listOfStr2.add("Z");
		listOfStr2.add(1);		
		listOfStr2.add(true);
		
		//to fetch multiple data
		String str3 = (String)listOfStr2.get(2);
		
		//if we use Generics
		System.out.println("string is " + str3);
		for(int i = 0; i < listOfStr.size(); i++) {
			System.out.println(listOfStr.get(i) + " ");
		}
		
		
	}

}
