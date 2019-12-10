package com.onmobile.employee.repository;

import com.onmobile.employee.domain.Employee;

public interface EmployeeDAO {

	public void insert(Employee employee);
	
	public void delete (int empid);
	
}
