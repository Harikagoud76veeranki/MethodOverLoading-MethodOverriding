package com.apj1;

/* Demonstrating the Employee class and child class Permanent and Contract Employee */

public class ContractEmployee extends Employee1 {
    String EmpType2;
    double ContractEmpSalary;

    // Method to display contract employee details
    void contractEmpDetails() {
        System.out.println("The type of Employee:" + (EmpType2));
    }

    // Overriding the total_Salary method
    void total_Salary() {
        System.out.println("Salary of Contract Employee:" + (ContractEmpSalary));
    }

    public static void main(String[] args) {
        // Creating object for ContractEmployee
        ContractEmployee ce = new ContractEmployee();
        ce.EmpID = 101;
        ce.EmpName = "Harika";
        ce.EmpMobileNo = 9876542;
        ce.EmpDetails();

        // Creating object for Employee to display salary
        Employee1 emp = new Employee1();
        emp.EmpSalary = 35000;
        emp.total_Salary();

        // Creating object for PermanentEmployee
        PermanentEmployee pe = new PermanentEmployee();
        pe.EmpType1 = "Permanent Employee";
        pe.PermanentEmpSalary = 25000;
        pe.permanentEmpDetails();
        pe.total_Salary();

        // Displaying salary of Contract Employee
        ce.EmpType2 = "Contract Employee";
        ce.ContractEmpSalary = 20000;
        ce.contractEmpDetails();
        ce.total_Salary(); // This displays the present class salary
    }
}
