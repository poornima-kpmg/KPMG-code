package com.programming.class1;

import java.io.IOException;

public class ExceptionProp {
	
	public static void main(String[] args) {
		
		a();
	}
	
	static void a() {
		try {
			b();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static void b() throws IOException{
		c();
	}
	
	static void c() throws IOException{
		throw new IOException("device error");
	}

}
