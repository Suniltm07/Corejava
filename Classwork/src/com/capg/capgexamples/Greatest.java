package com.capg.capgexamples;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int P=sc.nextInt();
		System.out.println("Enter Second Number");
		int Q=sc.nextInt();
		while(Q!=0)
		{
			int R=Q;
			Q=P%Q;
			P=R;
		}
		System.out.println("greatest Divisor is:"+P);
		
	}

}
