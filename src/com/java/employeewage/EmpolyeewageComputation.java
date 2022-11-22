package com.java.employeewage;

import java.util.Random;

public class EmpolyeewageComputation {

	public static void main(String[] args) {

		int empWagePerHour = 20;
		int fullDayPerHOur= 8;
		int partTime =4;
		double salary = 0;
		
		System.out.println("welcome to the employee wage computation program");
		Random random = new Random();
		int empCheck = random.nextInt(3);
		
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
	
		System.out.println("Daily Employee wage is:"+salary);
	}
}


