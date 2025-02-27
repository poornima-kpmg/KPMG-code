package com.programming.class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmpData {
	
	public static void main(String[] args) {
		
		int[] intArr = {4,5,2,3,468,230};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		String[] strArr = {"Z", "A", "M", "F", "H"};
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		List<String> listStr = new ArrayList<>();
		listStr.add("E");
		listStr.add("Z");
		listStr.add("A");
		listStr.add("H");
		Collections.sort(listStr);
		
		for(String str:listStr) {
			System.out.println(" " + str);
		}
		
		Employees[] empData = new Employees[3];
		empData[0] = new Employees(4,"Z",25,100,"M","HR","Blr",2003);
		empData[0] = new Employees(10,"A",34,200,"F","HR","Hyd",2009);
		empData[0] = new Employees(7,"M",29,300,"M","HR","Mysore",2013);
		
		Arrays.sort(empData);
		
	}

}
