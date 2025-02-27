package com.programming.class1;

abstract class Shape{
	
	abstract void draw();
	
	double area;	
	void calculateArea() {
		System.out.println("Area is " + area);
	}
}

class Rectangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
		double breadth = 20, height = 30;
		area = breadth * height;
		calculateArea();
	}
}

class Circle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Drawing Circle");
		double r = 50;
		area = 3.14 * r * r;
		calculateArea();
	}
}

public class LetsTestAbstraction {
	
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		Circle circ = new Circle();
		
		rec.draw();
		circ.draw();
	}

}
