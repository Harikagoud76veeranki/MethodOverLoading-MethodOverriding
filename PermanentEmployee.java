package com.apj1;

public class PermanentEmployee extends Employee1 {
    String EmpType1;
    double PermanentEmpSalary;

    // Method to display permanent employee details
    void permanentEmpDetails() {
        System.out.println("The type of Employee: " + (EmpType1));
    }

    // Overriding the total_Salary method
    void total_Salary() {
        System.out.println("Salary of permanent Employee:" + (PermanentEmpSalary));
    }
}
