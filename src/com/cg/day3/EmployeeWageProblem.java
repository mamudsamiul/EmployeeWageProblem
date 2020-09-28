package com.cg.day3;

import java.util.Random;

public class EmployeeWageProblem {
	final String company;
	final int empRatePerHour;
	final int numberOfWorkingDays;
	final int maxHrsPerMonth;
	int totalEmpWage;

	public EmployeeWageProblem(String company, int empRatePerHour, int numberOfWorkingDays, int maxHrsPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxHrsPerMonth = maxHrsPerMonth;
		this.numberOfWorkingDays = numberOfWorkingDays;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total emp wage for company: " + company + "is: " + totalEmpWage;
	}

}
