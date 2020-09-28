package com.cg.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EmpWageBuilderArray implements ComputeEmpWage {
	// Constant
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	private int numOfCompany = 0;
	private ArrayList<EmployeeWageProblem> companyEmpWageList;
	private Map<String, EmployeeWageProblem> companyToEmpWageMap;

	public EmpWageBuilderArray() {
		companyEmpWageList = new ArrayList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	@Override
	public void addCompanyEmpWage(String company, int empRatePerHour, int numberOfWorkingDays, int maxHrsPerMonth) {
		EmployeeWageProblem employeeWageProblem = new EmployeeWageProblem(company, empRatePerHour, numberOfWorkingDays,
				maxHrsPerMonth);
		companyEmpWageList.add(employeeWageProblem);
		companyToEmpWageMap.put(company, employeeWageProblem);
	}

	@Override
	public void computeEmpWage() {
		EmployeeWageProblem employeeWageProblem = companyEmpWageList.get(0);
		employeeWageProblem.setTotalEmpWage(this.computeEmpWage(employeeWageProblem));
		System.out.println(employeeWageProblem);
	}

	private int computeEmpWage(EmployeeWageProblem companyEmpWage) {
		// Variable
		int empHrs = 0, empWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;
		Random rand = new Random();// Instance of random class
		while (totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.numberOfWorkingDays) {
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
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	@Override
	public int getTotalWage(String company) {
		return 0;
	}

	public static void main(String[] args) {
		// Welcome Message
		System.out.println(": Welcome to Employee Wage calculation Program : ");
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("BigBazar", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Dmart", 10, 4, 20);
		empWageBuilder.computeEmpWage();
		System.out.println("Total Wage for BigBazar: " + empWageBuilder.getTotalWage("BigBazar"));
	}
}
