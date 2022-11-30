package com.java.employeewage;

public class EmployeeWageComputationMain {
	/**
	 * program execution starts from main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("welcome to the employee wage computation program");
		EmpolyeewageComputation employeewagecomputation = new EmpolyeewageComputation();
		EmpolyeewageComputation.ComputeEmpWage();
		employeewagecomputation.displayTotalSalary();
	}

}
