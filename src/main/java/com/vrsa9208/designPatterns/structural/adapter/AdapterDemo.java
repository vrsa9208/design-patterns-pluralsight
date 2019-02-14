package com.vrsa9208.designPatterns.structural.adapter;

import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeClient client = new EmployeeClient();
		
		List<Employee> employees = client.getEmployeeList();
		
		System.out.println(employees);
	}

}
