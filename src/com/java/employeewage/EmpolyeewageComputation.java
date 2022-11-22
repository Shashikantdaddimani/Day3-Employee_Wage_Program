package com.java.employeewage;

import java.util.Random;

public class EmpolyeewageComputation {

	public static void main(String[] args) {

		int empWagePerHour = 20;
		int fullDayPerHOur= 8;
		int partTime =4;
		double salary = 0;
		double totalSalary=0;
		double totalWorkingDays = 20;
		
		System.out.println("welcome to the employee wage computation program");
		Random random = new Random();
		int empCheck = random.nextInt(3);
		
		for(int i=1; i<totalWorkingDays; i++)
		{
		switch(empCheck) {
		
		case 0:
			System.out.println("Employee is Absent.");
			break;
		case 1:
			System.out.println("Employee is Present.");
		    salary = empWagePerHour * fullDayPerHOur;
		    break;
		case 2:
			System.out.println("present for part time");
			salary = empWagePerHour * partTime;
		
		}
		System.out.println("Salary is: "+salary);
		totalSalary = totalSalary + salary;
		
		}
		System.out.println("Total Salary: "+totalSalary);
	}
}

