package com.cg.day3;
import java.util.Random;

public class EmployeeWageProblem {
	// Constant
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numberOfWorkingDays;
	private final int maxHrsPerMonth;

	public EmployeeWageProblem(String company, int empRatePerHour, int numberOfWorkingDays, int maxHrsPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxHrsPerMonth = maxHrsPerMonth;
		this.numberOfWorkingDays = numberOfWorkingDays;

	}

	public static void main(String[] args) {

		// Welcome Message
		System.out.println(": Welcome to Employee Wage calculation Program : ");

		EmployeeWageProblem capgemini = new EmployeeWageProblem("Capgemini", 500, 20, 100);
		EmployeeWageProblem tcs = new EmployeeWageProblem("TCS", 400, 23, 80);

		// Variable
		int empHrs = 0, empWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;

		Random rand = new Random();// Instance of random class

		while (totalEmpHrs <= capgemini.maxHrsPerMonth && totalWorkingDays < capgemini.numberOfWorkingDays) {
			
			int rand_number = rand.nextInt(100);// Generating random number in between 0 and 100
			int empCheck = rand_number % 3;
			
			switch (empCheck) {
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;

			}
			
			totalWorkingDays++;
			totalEmpHrs += empHrs;

			System.out.println("Day : " + totalWorkingDays + " Emp Hours= " + empHrs);
		}
		
		empWage = totalEmpHrs * capgemini.empRatePerHour;
		System.out.println("Total Wage is of " + capgemini.company + "'s Employee is " + empWage);

	}

}
