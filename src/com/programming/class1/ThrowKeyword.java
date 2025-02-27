package com.programming.class1;

public class ThrowKeyword {
	
	public static void main(String[] args) {
		
		sampleMethod();
		
		System.out.println("rest of code...");
	}
	
	static void sampleMethod() {
		throw new NullPointerException("null object");
	}

}
