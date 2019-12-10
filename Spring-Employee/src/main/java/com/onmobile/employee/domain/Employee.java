package com.onmobile.employee.domain;

public class Employee {
	
	private int empID;
	private String name;
	private String lastName;
	private String departement;
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", lastName=" + lastName + ", departement=" + departement
				+ "]";
	}
	public Employee(int empID, String name, String lastName, String departement) {
		super();
		this.empID = empID;
		this.name = name;
		this.lastName = lastName;
		this.departement = departement;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
}
