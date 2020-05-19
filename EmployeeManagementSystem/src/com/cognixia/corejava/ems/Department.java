package com.cognixia.corejava.ems;

import java.util.List;

public class Department {
	
	private int departmentID;
	private String departmentName;
	private Manager headOfDepartment;
	private List<Employee> employees;
	public Department(int departmentID, String departmentName, Manager headOfDepartment, List<Employee> employees) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.headOfDepartment = headOfDepartment;
		this.employees = employees;
	}
	public Manager getHeadOfDepartment() {
		return headOfDepartment;
	}
	public void setHeadOfDepartment(Manager headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void addEmployee(Employee employees) {
		this.employees.add(employees);
	}
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + ", headOfDepartment="
				+ headOfDepartment + ", employees=" + employees + "]";
	}
	
}
