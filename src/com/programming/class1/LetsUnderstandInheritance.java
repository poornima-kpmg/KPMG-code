package com.programming.class1;

class Parent{
	int data = 10;
	
	void display() {
		System.out.println("Parent class method");
		System.out.println("Value of parent data is " + data);
	}
	
	void show() {
		System.out.println("Parent class method");
	}
}
public class LetsUnderstandInheritance extends Parent{
	int data = 20;
	
	@Override
	void display() {
		System.out.println("child class method");
		System.out.println("value of child data is "+ data);
	}
	
	void message() {
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		Parent obj = new Parent();
		System.out.println("data of obj is "+ obj.data);
		obj.display();
		
		LetsUnderstandInheritance obj2 = new LetsUnderstandInheritance();
		System.out.println("data of obj2 is "+ obj2.data);
		obj2.display();
		
		Parent obj3 = new LetsUnderstandInheritance();
		System.out.println("data of obj3 is "+ obj3.data);
		obj3.display();
		
	}
}