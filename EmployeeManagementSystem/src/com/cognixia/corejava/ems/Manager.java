package com.cognixia.corejava.ems;

public class Manager extends Employee{
	
	private boolean specialClearance;

	public Manager(int employeeID, String firstName, String lastName, String title, boolean specialClearance) {
		super(employeeID, firstName, lastName, title);
		this.specialClearance = specialClearance;
	}
	
	

}
