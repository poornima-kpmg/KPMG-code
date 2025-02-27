package com.programming.class1;

public class ArraysCreations {
	
	public static void main(String[] args) {
		
		//declaration and instantiation of an array
		int[] intArr = new int[5];
		
		//initialization
		intArr[0] = 90;
		intArr[2] = 30;
		intArr[4] = 10;
		intArr[3] = 40;
		intArr[1] = 50;
		
		for(int i = 0; i < intArr.length; i ++) {
			System.out.println(intArr[i] + " ");
		}
		
		//declaration, instantiation, initialization of an array
		String[] strArr = {"a", "b", "c", "d", "f"};
		
		for(int i = 0; i < strArr.length; i ++) {
			System.out.println(strArr[i] + " ");
		}
	}
}
