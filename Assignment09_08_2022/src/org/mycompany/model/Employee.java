package org.mycompany.model;

public class Employee {
   private int employeeId;
   private char employeeInitial;
   private int employeeSalary;


   
   public Employee() {
	   
   }
   
   public Employee(int id, char initial, int salary) {
		employeeId = id;
		employeeInitial = initial;
		employeeSalary = salary;
	}
   
   public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public char getEmployeeInitial() {
		return employeeInitial;
	}

	public void setEmployeeInitial(char employeeInitial) {
		this.employeeInitial = employeeInitial;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

   
}
