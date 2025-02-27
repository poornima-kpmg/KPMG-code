package com.programming.class1;

public class LoopConstructions {
	
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i ++ ;
		}
		
		int k = 1;
		do {
			System.out.println(k + " through do while loop");
			k ++ ;
		}while(k <= 10);
		
		
		for(int j = 0; j < 10; j ++) {
			System.out.println(j);
		}
	}

}
