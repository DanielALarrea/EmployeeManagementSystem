package com.cognixia.corejava.ems;

public class Department {
	
	private int departmentID;
	private String departmentName;
	private String headOfDepartment;
	
	public Department(int departmentID, String departmentName, String headOfDepartment) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.headOfDepartment = headOfDepartment;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + ", headOfDepartment="
				+ headOfDepartment + "]";
	}

}
