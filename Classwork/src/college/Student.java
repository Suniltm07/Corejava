package com.capg.college;

import java.util.Scanner;

public class Student
{
	public static void main(String[] args) {
        String roll;
        float A,B,C;
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=8; i++)
        {
            System.out.print("\nEnter Your Roll Number: ");
            roll = sc.next();

            System.out.print("Enter Your First Subject Mark: ");
            A = sc.nextFloat();

            System.out.print("Enter Your Second Subject Mark: ");
            B = sc.nextFloat();
            
            System.out.print("Enter Your Third Subject Mark: ");
            C = sc.nextFloat();

            float avg = (A + B + C) / 3;

            if(A<=100 && B<=100 && C<=100)
                {
                    System.out.printf("\nAverage Mark of Roll Number %s is %.1f\n", roll, avg);
                }
            else
                {
                    System.out.println("\nPlease Enter Your Marks Between 0 to 100");
                }
        }
    }
}
