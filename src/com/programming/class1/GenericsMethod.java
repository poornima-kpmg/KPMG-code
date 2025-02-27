package com.programming.class1;

public class GenericsMethod {
	
	public static void main(String[] args) {
		
		//wrapper class
		Integer[] intArr = {1,2,3,4,5};
		Character[] charArr = {'a', 'e', 'i', 'o'};
		
		System.out.println("printing int");
		printArray(intArr);
		
		System.out.println("printing char");
		printArray(charArr);
				
	}
	
	static <E> void printArray(E[] elements) {    //<E> method entertains any data type 
		for(E ele:elements) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

}
