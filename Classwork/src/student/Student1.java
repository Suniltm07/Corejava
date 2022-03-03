package com.capg.student;

import java.util.Scanner;

public class Student1 extends Person
{

	String Student1Program;
	int Student1Year;
	double Student1Fee;
	
	Scanner sc=new Scanner(System.in);
	public void readStudent1Details()
	{
		 readPersonDetails();
		System.out.println("Enter Student1Program ");
		Student1Program=sc.nextLine();
		System.out.println("Enter Student1Year");
		Student1Year=sc.nextInt();
		System.out.println("Enter Student1fes");
		Student1Fee=sc.nextDouble();
	}
	void printStudent1Details()
	{
		System.out.println("Student1Program :"+Student1Program);
		System.out.println("Student1Year:"+Student1Year);
		System.out.println("Student1Fee:"+Student1Fee);
		System.out.println("Person Name:"+personName);
		System.out.println("Person Address:"+personAddress);
	}
	
}
