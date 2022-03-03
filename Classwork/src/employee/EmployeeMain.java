package com.capg.employee;

import java.text.ParseException;

public class EmployeeMain {
public static void main(String[] args) throws ParseException 
{
	
	EmployeeCRUD scrud = new EmployeeCRUD();
	scrud.menu();
}
}
