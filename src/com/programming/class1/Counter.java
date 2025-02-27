package com.programming.class1;

public class Counter {
	
	static int count;
	
	Counter(){
		count ++ ;
		System.out.println("value ofcount is " + count);
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}

}
