package com.programming.class1;

public class OrgData {
	
	//non static
	int empId;
	String empName;
	int empAge;
	
	//static
	static String orgAdd;
	
	//Constructors are only written for non static variable initiations
	OrgData(int empId, String empName, int empAge){
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	
	//static initializer block is written only for static variable initiations
	static {
		orgAdd = "ABC, XYZ, PQR";
	}
	
	void display() {
		System.out.println(empId + " " + empName + " " + empAge + " " );
	}
	
	public static void main(String[] args) {
		
		System.out.println(orgAdd);
		
		OrgData o1 = new OrgData(123, "A", 25);
		OrgData o2 = new OrgData(125, "B", 27);
		OrgData o3 = new OrgData(127, "C", 29);
		
		o1.display();
		o2.display();
		o3.display();
		
	}

}
