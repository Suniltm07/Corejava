package com.capg.employee;

import java.text.ParseException;
import java.util.Scanner;

public class EmployeeCRUD 
{
	Employee1[] listOfemployees = new Employee1[30];
	Employee1 employee;
	int noOfEmployee;
	Scanner sc = new Scanner(System.in);
	char ch = 'y';

	public void menu() throws ParseException {

		while (ch == 'y') {

			System.out.println("Enter the choice .....");
			System.out.println("add : to add Employee in the array");
			System.out.println("update:to update Employee in the array");
			System.out.println("delete:to delete Employee in the array");
			System.out.println("display: to display all Employee");
			System.out.println("search: to search for a Employee");
			sc.nextLine();
			String choice = sc.nextLine();
			switch (choice) {
			case "add":
				addEmployee();
				break;
			case "update":
				updateEmployee();
				break;
			case "delete":
				deleteEmployee();
				break;
			case "display":
				displayEmployee();
				break;
			case "search":
				searchEmployee();
				break;
			default:
				System.out.println("Not a proper choice");
				break;
			}

			System.out.println("do you want to continue....");
			System.out.println("Enter 'y' to continue ......");
			ch = sc.next().charAt(0);

		} 

	}

	int count = 0;
	int j=0;
	void searchEmployee() {
		System.out.println("Enter the Employeedetails to search");
		System.out.println("Enter the Employee id to search");
		int eId = sc.nextInt();
		for (int i = 0; i < noOfEmployee; i++) {
			if(listOfemployees[i].employee == eId) {
				count++;
				j = i;
			}
		}

		if(count > 1) {
			System.out.println("Employee Found..........");
			listOfemployees[j].displayEmployeeDetails();
			
		}else {
			System.out.println("EmployeeNot Found..........");
		}
	}

	void displayEmployee() {
		System.out.println("Enter the Employee details to display");
		

		for (int i = 0; i < listOfemployees; i++) {
			if(listOfemployees[i] == null) {
				continue;
			}
			listOfemployees[i].displayEmployeeDetails();
		}
	}

	void deleteEmployee() {
		System.out.println("Enter theEmployee details to delete");
		System.out.println("Enter theEmployee id to search");
		int eId = sc.nextInt();
		for (int i = 0; i < noOfEmployee; i++) {
			if(listOfemployees[i].employeeId == eId) {
				listOfemployees[i] = null;
				break;
			}else {
				System.out.println("EmployeeNot Found..........");
			}
		}
	}

	void updateEmployee() {
		System.out.println("Enter the Employee details to update");
		int eId = sc.nextInt();
		for (int i = 0; i < noOfEmployee; i++) {
			if(listOfemployees[i].employeeId == eId) {
				System.out.println("Enter the new details of Employeeto update");
				System.out.println("Enter the new email of Employee.....");
				sc.nextLine();
				listOfemployees[i].employeeEmail = sc.nextLine();
				break;
			}else {
				System.out.println("EmployeeNot Found..........");
			}
		}
	}

	void addEmployee() throws ParseException {
		System.out.println("Enter the Employee details");


		System.out.println("Enter the number of Employee");
		noOfEmployee = sc.nextInt();
		for (int i = 0; i < noOfEmployee; i++) {
			employee = new Employee1();
			employee.readEmployeeDetails();
			listOfemployees[i] =employee;

		}
	}

}
