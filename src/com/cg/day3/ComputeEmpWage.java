package com.cg.day3;

public interface ComputeEmpWage {
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);

	public void computeEmpWage();

	public int getTotalWage(String company);
}
