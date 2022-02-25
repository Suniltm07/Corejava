package stringExample;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a String");
	   String str=sc.nextLine();
	   int count=0;
	   String[] ch=str.split(" ");
	  
	   for(String c:ch)
	   {
		   System.out.print(c);
	   }
	   for(String c:ch)
	   {
		   count=count+1;
	   }
	   System.out.println("no of coun words:"+count);
	}

}
