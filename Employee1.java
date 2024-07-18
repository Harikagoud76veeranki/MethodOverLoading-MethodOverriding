package com.apj1;

/*Demonstrating Method overriding with sub classes 
  permanent employee and contract employee*/

public class Employee1 {

	int EmpID;
	String EmpName;
	int EmpMobileNo;
	double EmpSalary;

	// Method to display employee details
	void EmpDetails() {
		System.out.println("Employee Identity Number = " + (EmpID));
		System.out.println("Employee Name = " + (EmpName));
		System.out.println("Employee's Mobile Number = " + (EmpMobileNo));
	}

	// Method to display total salary
	void total_Salary() {
		System.out.println("The salary of an employee= " + (EmpSalary));
	}
}
