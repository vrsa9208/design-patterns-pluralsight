package com.vrsa9208.designPatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDb = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
		
		employees.add(employeeFromDb);
		
		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
		
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));
		
		EmployeeCSV employeeFromCsv = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
		
		employees.add(new EmployeeAdapterCSV(employeeFromCsv));
		
		return employees;
	}
}
