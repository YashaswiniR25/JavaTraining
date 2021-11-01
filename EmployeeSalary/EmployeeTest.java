package com.EmployeeSalaryDetails;
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the id of the Employee : ");
			int employeeid=sc.nextInt();
			
			System.out.println("enter the name of the Employee : ");
			String empname=sc.next();
			
			System.out.println("enter the Basic Salary of the Employee : ");
			double basicsalary=sc.nextDouble();
		
			emp1.display(basicsalary);
	}
}
