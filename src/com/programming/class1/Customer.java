package com.programming.class1;

public class Customer {
	
	String CustFirstName;
	String CustLastName;
	int CustAge;
	String CustAdd;
	
	public String getCustFirstName() {
		return CustFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		CustFirstName = custFirstName;
	}
	public String getCustLastName() {
		return CustLastName;
	}
	public void setCustLastName(String custLastName) {
		CustLastName = custLastName;
	}
	public int getCustAge() {
		return CustAge;
	}
	public void setCustAge(int custAge) {
		CustAge = custAge;
	}
	public String getCustAdd() {
		return CustAdd;
	}
	public void setCustAdd(String custAdd) {
		CustAdd = custAdd;
	}
	
	public static void main(String[] args) {
		
		Customer emp = new Customer (); //create object
		
		emp.setCustFirstName("ABC");
		emp.setCustLastName("XYZ");
		emp.setCustAge(50);
		emp.setCustAdd("#15, church Street");
		
		System.out.println("First Name of the Customer is " + emp.getCustFirstName()); //out-implicit object, println-its method
		System.out.println("Last Name of the Customer is " + emp.getCustLastName()); 
		System.out.println("Age of the employee is " + emp.getCustAge()); 
		System.out.println("Location of the employee is " + emp.getCustAdd());
		
	}

}
