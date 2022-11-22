package com.java.employeewage;

import java.util.Random;

public class EmpolyeewageComputation {

	public static void main(String[] args) {
		System.out.println("welcome to the employee wage computation program");
		
		Random random = new Random();
		int empCheck = random.nextInt(2);
		if(empCheck == 1)
		{
			System.out.println("Employee is Present.");
		}
		else
		{
			System.out.println("Employee is Absent.");
		}

	}
	}


