package capgstringexample;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String str= sc.nextLine();
	  String[]words=str.split(" ");
	  int count=0;
	  for(String ele:words)
	  {
		  System.out.print(ele);
	  }
	  for(String c:words)
	  {
		  count=count+1;
	  }
	  System.out.println("no of words:"+count);
	}

}
