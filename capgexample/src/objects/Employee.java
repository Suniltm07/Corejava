package objects;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Employee 
{
	int Employee_id;
	String Employee_Name;
	String Employee_Email;
	String Employee_MobNo;
	Date Employee_Dob;
	Date Employee_Doj;
	

	
		Scanner sc=new Scanner(System.in);
		
		void readEmployeeDetails()throws ParseException
		{
		System.out.println("Enter a Employee ID");
		 Employee_id=sc.nextInt();
		 
		System.out.println("Enter a Employee Name");
		sc.nextLine();
		 Employee_Name=sc.nextLine();
		 
		System.out.println("Enter a Employee Email");
	     Employee_Email=sc.nextLine();
	     
		System.out.println("Enter a Employee MOBno");
		 Employee_MobNo=sc.nextLine();
		 
		System.out.println("Enter a Employee Dob");
		String Dob=sc.nextLine();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		 Employee_Dob =  (Date) sdf.parse(Dob);
		
		System.out.println("Enter a Employee Doj");
		String Doj=sc.nextLine();
	
		
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/mm/yyyy");
		Employee_Doj = (Date) sdf1.parse(Doj);
		}
		
		void displayEmployeeDetails()
		{
			System.out.println("Employee ID:"+Employee_id);
			System.out.println("Employee Name:"+Employee_Name);
			System.out.println("Employee Email:"+Employee_Email);
			System.out.println("Employee Mobno:"+Employee_MobNo);
			System.out.println("Employee Dob:"+Employee_Dob);
			System.out.println("Employee doj:"+Employee_Doj);
		}

	

}
