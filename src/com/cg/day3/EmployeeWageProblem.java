package com.cg.day3;
import java.util.Random; 

public class EmployeeWageProblem {
	//Constant
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	
	public static void calcEmpWageForCompany(String companyName,int empRate,int numOfDays,int maxHrs)
	{
		//Variable
		int empHrs=0,empWage=0,totalWage=0,totalWorkingDays=0,totalEmpHrs=0;
				
		Random rand = new Random();//Instance of random class
		
		while(totalEmpHrs<=maxHrs && totalWorkingDays<numOfDays) {
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
		empWage=totalEmpHrs*empRate;
		System.out.println("Total Wage is of "+companyName+"'s Employee is "+empWage);
	}

	public static void main(String[] args) {
		
		
		
		//Welcome Message
		
		System.out.println(": Welcome to Employee Wage calculation Program : ");
		calcEmpWageForCompany("Capgemini",500,20,100);
		calcEmpWageForCompany("TCS",500,25,130);
		
		
	}

}
