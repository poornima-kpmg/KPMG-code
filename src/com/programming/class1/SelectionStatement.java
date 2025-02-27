package com.programming.class1;

public class SelectionStatement {
	
	public static void main(String[] args) {
		
		int marks = 77;
		
		if(marks <= 35) {
			System.out.println("fail");		
		}
		
		else if(marks > 35 && marks < 75) {
			System.out.println("Average");		
		}
		
		else {
			System.out.println("Excellent");		
		}
	}
}
