package org.mycompany.view;

import org.mycompany.model.Employee;
import org.mycompany.service.EmployeeService;

public class EmployeeView {
	public static void main(String args[]) {
	EmployeeService employeeservice = new EmployeeService();
	Employee employee = new Employee(1, 'A', 10000);
	Employee employee1 = employeeservice.calaulateSalaryIncrement(employee);
	System.out.println("Employee Id : " + employee.getEmployeeId());
	System.out.println("Employee Initial : " + employee.getEmployeeInitial());
	System.out.println("Updated Salary : " + employee1.getEmployeeSalary());
	
 }
}
