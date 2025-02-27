package com.programming.class1;

class Super{
	int value = 10;
	
	void show() {
		System.out.println("parent method: " + value);
	}
}

public class MethodOverriding extends Super{
	int value = 20;
	
	@Override
	void show() {
		System.out.println("parent method: " + value );
	}
	
	public static void main(String[] args) {
		Super s = new Super();
		s.show();
		
		MethodOverriding m = new MethodOverriding();
		m.show();
		
		Super sm = new MethodOverriding();
		sm.show();
		
	}
}

