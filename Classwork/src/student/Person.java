package com.capg.student;

import java.util.Scanner;

public class Person 
{

	String personName; 
	String personAddress;
	
	Scanner sc=new Scanner(System.in);	
	void readPersonDetails()
	{
    System.out.println("Enter person Name");
    personName=sc.nextLine();
    System.out.println("Enter person address");
    personAddress=sc.nextLine();   
	
    }
	
	void printPersonDetails()
	{
		System.out.println("Person Name:"+personName);
		System.out.println("Person Address:"+personAddress);
		
		
	}
}
