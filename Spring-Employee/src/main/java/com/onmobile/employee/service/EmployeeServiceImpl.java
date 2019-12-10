package com.onmobile.employee.service;

import com.onmobile.employee.domain.Employee;
import com.onmobile.employee.repository.EmployeeDAO;
import com.onmobile.employee.repository.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao = new EmployeeDAOImpl();
	

	@Override
	public void insertRecord(Employee emp) {
		// TODO Auto-generated method stub
		
		dao.insert(emp);
		
	}

	@Override
	public void deleteRecord(int empID) {
		// TODO Auto-generated method stub
		dao.delete(empID);
		
	}

	
	
}
