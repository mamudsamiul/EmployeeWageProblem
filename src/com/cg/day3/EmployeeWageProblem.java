package com.cg.day3;
import java.util.Random; 


public class EmployeeWageProblem {

	public static void main(String[] args) {
		
		//Constant
		final int IS_FULL_TIME=1;
		final int IS_PART_TIME=2;
		final int EMP_RATE_PER_HOUR=200;
		final int NUM_OF_WORKING_DAYS=20;
		final int MAX_HRS_IN_MONTH=100;
		//Variable
		int empHrs=0,empWage=0,totalWage=0,totalWorkingDays=0,totalEmpHrs=0;
		
		//Welcome Message
		
		System.out.println(": Welcome to Employee Wage calculation Program : ");
		
		
		Random rand = new Random();//Instance of random class
		
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS) {
		int rand_number=rand.nextInt(100);//Generating random number in between 0 and 100
		
		int empCheck=rand_number%3;
		switch(empCheck) {
			case IS_FULL_TIME:
				empHrs=8;
				break;
			case IS_PART_TIME:
				empHrs=4;
				break;
			default:
				empHrs=0;
			
				
		}
		totalWorkingDays++;
		totalEmpHrs+=empHrs;
		
	
		System.out.println("Day : "+totalWorkingDays +" Emp Hours= "+empHrs);
		}
		empWage=totalEmpHrs*EMP_RATE_PER_HOUR;
		System.out.println("Total wage is : "+empWage);
		
	}

}
