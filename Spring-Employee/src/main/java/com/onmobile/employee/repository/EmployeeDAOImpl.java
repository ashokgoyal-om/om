package com.onmobile.employee.repository;


import java.sql.Connection;
import java.sql.PreparedStatement;

import com.onmobile.employee.domain.Employee;
import com.onmobile.employee.util.ConnectionManager;

public class EmployeeDAOImpl  implements EmployeeDAO{
	
	private Connection con =null;
	private PreparedStatement ps = null;
	private String query = "insert into employee values (?,?,?,?)";
	private String delete = "delete from employee where empID = ?";

	
	
	@Override
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("insering record " + employee.toString());
		con = ConnectionManager.getInstance().getConnection();
		if(con!=null) {
			
			try {
				ps = con.prepareStatement(query);
				ps.setInt(1,employee.getEmpID());
				ps.setString(2, employee.getName());
				ps.setString(3, employee.getLastName());
				ps.setString(4, employee.getDepartement());
				
				ps.executeUpdate();
				
				System.out.println("Added successfully");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public void delete(int empid) {
		// TODO Auto-generated method stub
		System.out.println("deleting " + empid);
		con = ConnectionManager.getInstance().getConnection();
		if(con!=null) {
			
			try {
				ps = con.prepareStatement(delete);
				ps.setInt(1,empid);
			
				ps.execute();
				
				System.out.println("deleted successfully");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
