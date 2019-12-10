package com.onmobile.employee.service;

import com.onmobile.employee.domain.Employee;

public interface EmployeeService {
	
	public void insertRecord (Employee emp);
	
	public void deleteRecord(int empID);

}
