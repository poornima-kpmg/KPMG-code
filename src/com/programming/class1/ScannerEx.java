package com.programming.class1;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		String str = "ABC";
		Scanner sc = new Scanner(str);
		System.out.println(sc.hasNext());
		
		System.out.println(sc.nextLine());
		sc.close();
		
		System.out.println("enter the details: ----");
		Scanner in = new Scanner(System.in);
		
		System.out.println("please enter your name: ");
		String name = in.next();		
		System.out.println(name);
		
		System.out.println("please enter your age: ");
		int age = in.nextInt();
		System.out.println(age);
		
		System.out.println("please enter your income: ");
		int income = in.nextInt();
		System.out.println(income);
		
		
		}

}
