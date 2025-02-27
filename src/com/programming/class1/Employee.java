package com.programming.class1;

public class Employee {

	// 4 attributes/properties/non static instance variables/instance variable
	String empName;       //start with small letters
	int empAge;
	String empDesignation;
	double empSalary;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee (); //create object
		
		emp.setEmpName("ABC");
		emp.setEmpAge(21);
		emp.setEmpDesignation("Consultant");
		emp.setEmpSalary(7000.00);
		
		System.out.println("Name of the employee is " + emp.getEmpName()); //out-implicit object, println-its method
		System.out.println("Age of the employee is " + emp.getEmpAge()); 
		System.out.println("Designantion of the employee is " + emp.getEmpDesignation()); 
		System.out.println("Salary of the employee is " + emp.getEmpSalary()); 
		
		
	}

}
