/**
 * Refactor the Code to write a Class Method to Compute
 *Employee Wage - Use Class Method and Class Variables
 */
package com.java.employeewage;
/**
 * imports all the class of the java.util package
 */
import java.util.*;

public class EmpolyeewageComputation 
{
	/*
	 * Declaring And initialization of veriable 
	 */
		static int empWagePerHour = 20;
		static int fullDayHour = 8;
		static int halfDayHour = 4;
		static int salary = 0;
		static int totalSalary = 0;
		static int totalWorkingDays = 20;
		static int days =0;
		static int totalWorkingHours = 0;
		/*
		 * logic for checking empwage using the method
		 */
		static void ComputeEmpWage() 
		{
			/*
			 * taking random object because Generating the random number
			 */
		Random random = new Random();
		while(days != totalWorkingDays && totalWorkingHours != 100)
		{
			
			int empCheck = random.nextInt(3);
			/*
			 * logic for checking conditions using switch case statement 
			 */
			switch(empCheck)
			{
				case 0: System.out.println("Employee is Absent.");
						break;	
				case 1: System.out.println("Employee is Present.");
						salary = empWagePerHour * fullDayHour ;
						totalWorkingHours = totalWorkingHours + fullDayHour;
						break;
				case 2: System.out.println("Present for Half Day");
						salary = empWagePerHour * halfDayHour ;
						totalWorkingHours = totalWorkingHours + halfDayHour;
			}
				System.out.print("random: "+empCheck+"\t");
				System.out.print("Working Hours: "+totalWorkingHours+"\t");
				System.out.print("\tSalary is: "+salary+"\t");
				totalSalary = totalSalary + salary;
				days++;
		}
		System.out.println("Total Salary: "+totalSalary);
	}
		void displayTotalSalary() {
			System.out.println("Total Salary: "+totalSalary);
			}
}

