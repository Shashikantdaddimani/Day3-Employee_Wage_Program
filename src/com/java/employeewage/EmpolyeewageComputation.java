package com.java.employeewage;

import java.util.Random;

public class EmpolyeewageComputation {

	public static void main(String[] args) {

		int empWagePerHour = 20;
		int fullDayPerHOur= 8;
		double salary = 0;
		
		System.out.println("welcome to the employee wage computation program");
		Random random = new Random();
		int empCheck = random.nextInt(2);
		if(empCheck == 1)
		{
			System.out.println("Employee is Present.");
			salary = empWagePerHour * fullDayPerHOur;
		}
		else
		{
			System.out.println("Employee is Absent.");
		}
		System.out.println("Daily Employee wage is:"+salary);
	}
	}


