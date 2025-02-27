package com.programming.class1;

class GenericClass<T>{
	
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get(){
		return obj;
	}
}

public class UseOfGenericClass {
	
	public static void main(String[] args) {
		
		GenericClass<Integer> gC = new GenericClass<Integer> ();
		gC.add(123);
		System.out.println("data is " + gC.get());
		
		GenericClass<String> gC2 = new GenericClass<String> ();
		gC2.add("Z");
		System.out.println("data is " + gC2.get());
	}	
}
