package com.programming.class1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {
	
	public static void main(String[] args) {
		
		List<String> listStr = new ArrayList<>();
		listStr.add("v");
		listStr.add("t");
		listStr.add("h");
		listStr.add(null);
		listStr.add("n");
		listStr.add("e");
		
		List<String> listStr2 = new ArrayList<>();
		listStr2.add("p");
		listStr2.add("g");
		listStr2.add("r");
		
		listStr.set(1, "Pqr");  //update at index
		
		listStr.addAll(listStr2);
		
		listStr.removeAll(listStr2);
		/* size() fnc is used with Collections
		   length() property is used with strings
		   length fnc is used with arrays
		 */
		System.out.println("size of list is " + listStr.size());
		Iterator<String> itr = listStr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}

}
