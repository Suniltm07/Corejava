package com.capg.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class Employee1
{
	int employeeId;
	String employeeName;
	String employeeEmail;
	long employeeMobNo;
	Date employeeDOB;
	Date employeeDOJ;
	Scanner sc = new Scanner(System.in);
	public void readEmployeeDetails() throws ParseException
	{
		System.out.println("Enter the employee data");
		System.out.println("Enter the employee id");
		employeeId = sc.nextInt();
		System.out.println("Enter the employee name");
		sc.nextLine();
		employeeName = sc.nextLine();
		System.out.println("enter the employee mobile no");
		employeeMobNo = sc.nextLong();
		System.out.println("Enter the employee dob in 'dd/mm/yyyy' ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
		String dob = sc.nextLine();
		employeeDOB = sdf.parse(dob);
		System.out.println("Enter the employee doj in 'dd/mm/yyyy' ");
		employeeDOJ = sdf.parse(dob);
		
	}
	@SuppressWarnings("deprecation")
	public void displayEmployeeDetails()
	{
		System.out.println("Entered the employee data ...............");
		System.out.println("employee id = " +employeeId );
		System.out.println("employee name = " + employeeName);
		System.out.println("employee mail = " + employeeEmail);
		System.out.println("employee mobile no = " + employeeMobNo);
		System.out.println("employee dob = " + employeeDOB);
		System.out.println("employee doj = " + employeeDOJ);
	
		
		System.out.println("employee dob = " + employeeDOB.getDate()+"/"+employeeDOB.getMonth()+"/"+employeeDOB.getYear());
		System.out.println("employee dob = " + employeeDOJ.getDate()+"/"+employeeDOJ.getMonth()+"/"+employeeDOJ.getYear());
	}
	
	
}
