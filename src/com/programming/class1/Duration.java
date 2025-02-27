package com.programming.class1;

public class Duration {
	
	long startValue, endValue;
	
	Duration(long startValue, long endValue){   //Duration - constructor
		
		if(startValue > endValue) {
			throw new IllegalArgumentException("Start cannot be greater than end");
		}
		
		this.startValue = startValue;
		this.endValue = endValue;
 
	}

	public static void main(String[] args) {
		
		Duration obj = new Duration(23, 9);
		 System.out.println("start is "+ obj.startValue);
		 System.out.println("end is "+ obj.endValue);
	}	
	
}

