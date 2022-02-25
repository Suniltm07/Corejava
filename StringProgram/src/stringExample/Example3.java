package stringExample;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String");
      String msg=sc.nextLine();
      System.out.println("enter check the string index");
      char ch=sc.next().charAt(0);
       int s= msg.indexOf(ch);
       System.out.println(s);
	}

}
