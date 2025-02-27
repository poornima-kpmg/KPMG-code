package com.programming.class1;

public class MethodOverloading {
	
	static int add(int a, int b) {
		return  a + b;
	}
	
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static double add(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		System.out.println(MethodOverloading.add(12, 14));
		System.out.println(MethodOverloading.add(12, 14, 5 ));
		System.out.println(MethodOverloading.add(12.222, 14.333));		
	}
}
	
