package stringExample;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args)
	{
		String msg;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	msg=sc.nextLine();
	String [] words=msg.split(" ");
	int count=0;
	for(String s:words)
	{
		System.out.print(s);
		
	}
	for(String c:words) {
		count=count+1;
	}
	
	System.out.println("no of words : "+count);

	}

}
