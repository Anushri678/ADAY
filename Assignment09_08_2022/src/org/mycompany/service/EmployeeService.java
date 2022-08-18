package org.mycompany.service;

import org.mycompany.model.Employee;

public class EmployeeService {

	public Employee calaulateSalaryIncrement(Employee employee) {
		employee.setEmployeeSalary(employee.getEmployeeSalary() +  employee.getEmployeeSalary()*25/100);
		return employee;
	}
	
}
