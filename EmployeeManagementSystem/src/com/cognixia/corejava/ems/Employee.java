package com.cognixia.corejava.ems;

public class Employee {
	
	private int employeeID;
	private String firstName;
	private String lastName;
	private String department;
	private String title;
	
	public Employee(int employeeID, String firstName, String lastName, String department, String title) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.title = title;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", department=" + department + ", title=" + title + "]";
	}

}
