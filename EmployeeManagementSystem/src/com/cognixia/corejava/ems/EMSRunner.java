package com.cognixia.corejava.ems;

import java.util.ArrayList;
import java.util.List;

public class EMSRunner {

	public static void main(String[] args) {

		Employee employee1 = new Employee(1, "Michael", "Anderson", "Software Developer");
		Employee employee2 = new Employee(2, "Jordan", "Heinberg", "Software Developer");
		Employee employee3 = new Employee(3, "Kevin", "McShane", "Software Developer");
		Manager manager1 = new Manager(10, "Eric", "Jackson", "Manager of IT", true);
		List<Employee> employees1 = new ArrayList<>();
		
		Department depart1 = new Department(1, "Software Development", manager1, employees1);
		
		depart1.addEmployee(employee1);
		depart1.addEmployee(employee2);
		depart1.addEmployee(employee3);
		
		System.out.println(depart1);
	}

	
	private static void runPrompt () {
		/* 
		* Ask what the user what they wish to do
		* They have the following options:
		* Add Employee
		* Add Department
		* Update Employee
		* Update Department
		* View Employee
		* View Department
		* Delete Employee
		* Delete Department
		*
		* Could have option at beginning to select either Employee or Department 
		* and then give Add/Update/View/Delete options
		* 
		* Should Department be able to have no employees? No Manager?
		* Should an Employee be able to not belong to a department?
		*/
		
	}
}
