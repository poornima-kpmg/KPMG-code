package com.programming.class1;

import java.util.ArrayList;
import java.util.List;

public class ConvertingArray {
	
	public static void main(String[] args) {
		
		List<String> listStr = new ArrayList<>();
		listStr.add("z");
		listStr.add("a");
		listStr.add(null);
		listStr.add("m");
		
		List<String> listStr2 = new ArrayList<>();
		listStr2.add("p");
		listStr2.add("q");
		
		
		listStr.set(1, "ABC");
		listStr.addAll(listStr2);
		listStr.removeAll(listStr2);
		
		System.out.println("size of list is " + listStr.size());
	}

}
