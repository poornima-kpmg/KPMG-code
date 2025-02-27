package com.programming.class1;

public class EmpData {
	
	int empId;
	String empName;
	int empAge;
	
	EmpData(){
		empId = 999;
		empName = "ABC";
		empAge = 25;
	}
	
	//Constructor Overloading
	EmpData(int empId){
		this.empId = empId;
		empName = "ABC";
		empAge = 25;
	}
	
	EmpData(String empName, int empAge){
		empId = 120;
		this.empName = empName;
		this.empAge = empAge;
	}
	
	void display() {
		System.out.println(empId + " " + empName + " " + empAge + " ");
	}
	
	public static void main(String[] args) {
		EmpData e1 = new EmpData();
		e1.display();
		EmpData e2 = new EmpData(123);
		e2.display();
		EmpData e3 = new EmpData("Raj", 23);
		e3.display();
	}
}
