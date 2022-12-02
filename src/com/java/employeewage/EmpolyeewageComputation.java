/**
 *Uc8-Ability to compute Employee Wage for multiple companies
 */
package com.java.employeewage;

/**
 * imports all the class of the java.util package
 */
import java.util.*;

public class EmpolyeewageComputation {
	/*
	 * Declaring And initialization of variable
	 */

	public static final int fullDayHour = 8;
	public static final int halfDayHour = 4;

	private final String companyName;
	private final int employeeWagePerHr;
	private final int workingHours;
	private final int workingDays;
	/*
	 * Taking random object because Generating the random number
	 */
	static Random random = new Random();

	/*
	 * creating constructor
	 */
	public EmpolyeewageComputation(String companyName, int employeeWagePerHr, int workingHours, int workingDays) {
		this.companyName = companyName;
		this.employeeWagePerHr = employeeWagePerHr;
		this.workingHours = workingHours;
		this.workingDays = workingDays;
	}

	/*
	 * logic for checking Employeewage using the method
	 */
	public int calculateWage() {

		int salary = 0;
		int totalSalary = 0;
		int days = 0;
		int totalWorkingHours = 0;

		/*
		 * logic for checking Employeewage using the method
		 */
		while (totalWorkingHours <= workingHours && days <= workingDays) {
			days++;
			int empCheck = random.nextInt(3);
			/*
			 * logic for checking conditions using switch case statement
			 */
			switch (empCheck) {
			case 1:
				System.out.println("Present for full Day");
				salary = employeeWagePerHr * fullDayHour;
				totalWorkingHours = totalWorkingHours + fullDayHour;
				break;

			case 2:
				System.out.println("Present for Half Day");
				salary = employeeWagePerHr * halfDayHour;
				totalWorkingHours = totalWorkingHours + halfDayHour;
				break;
			default:
				System.out.println("Employee Abscent");
			}
			System.out.print("Day: " + days + "\t random: " + empCheck + "\t");
			System.out.print("Working Hours: " + totalWorkingHours + "\t");
			System.out.print("\tSalary is: " + salary + "\t");
			totalSalary = totalSalary + salary;

		}
		return totalWorkingHours * employeeWagePerHr;
	}

	public static void main(String[] args) {
		/*
		 * EmpWageComputation dmart = new EmpWageComputation(companyName,
		 * empWagePerHour, workingHours, workingDays);
		 */
		EmpolyeewageComputation dmart = new EmpolyeewageComputation("Dmart", 23, 90, 21);
		EmpolyeewageComputation jioMart = new EmpolyeewageComputation("Walmart", 24, 109, 22);

		System.out.println("Total employee's wage of Company: " + dmart.companyName + ": " + dmart.calculateWage());
		System.out.println("Total employee's wage of Company: " + jioMart.companyName + ": " + jioMart.calculateWage());

	}
}
