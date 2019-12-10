package com.onmobile.employee.client;

import java.util.Scanner;

import com.onmobile.employee.domain.Employee;
import com.onmobile.employee.service.EmployeeService;
import com.onmobile.employee.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Starting employee app");
		
		EmployeeService service = new EmployeeServiceImpl();
		Employee emp1 = new Employee(14, "shree", "kapoor", "QA");
		Employee emp2 = new Employee(1, "sh", "kapoor", "QA");
		
		service.insertRecord(emp1);
		service.insertRecord(emp2);
		
		System.out.println("Completed");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp id to be deleted : ");
		int empID =  sc.nextInt();
		
		System.out.println("deleting record for id " + empID);
		
		service.deleteRecord(empID);
		System.out.println("Deleted");
		
		
		
	}

}
