package com.cg.day3;
import java.util.Random; 


public class EmployeeWageProblem {

	public static void main(String[] args) {
		
		//Constant
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int EMP_RATE_PER_HOUR=200;
		
		//Variable
		int empHrs=0,empWage=0;
		
		//Welcome Message
		
		System.out.println(": Welcome to Employee Wage calculation Program : ");
		
		
		Random rand = new Random();//Instance of random class
		int rand_number=rand.nextInt(100);//Generating random number in between 0 and 100
		
		
		double empCheck=rand_number%3;
		if(empCheck==IS_FULL_TIME)
		{
			empHrs=8;
		}
		else if(empCheck==IS_PART_TIME)
		{
			empHrs=4;
		}
		else
		{
			empHrs=0;
		}
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Daily wage is : "+empWage);
	}

}
