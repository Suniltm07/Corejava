package com.capg.array;

import java.util.Scanner;

public class ArrayExample2_4
{
	public static void main ( String ar [])

	{

	Scanner sc=new Scanner (System.in);

	int n,I,p=0,c=0,o=0,e=0,z=0;

	for(I=1;I<=20;I++);

	{

	System.out.println("Enter a number");

	n=sc.nextInt();

	if (n>0)

	p++; 

	if (n<0)

	c++; 

	if (n%2==0)

	e++; 

	if (n%2!=0)

	o++; 

	if (n==0)

	z++; 

	}

	System.out.println("number of positive numbers"+p);

	System.out.println("number of negative numbers"+c);

	System.out.println("number of odd numbers"+o);

	System.out.println("number of even numbers"+e);

	System.out.println("number of zeroes"+z);

	}

}
