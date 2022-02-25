package capgexample;

import java.util.Scanner;


public class Example15 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []words=str.split(" ");
		int count=1;
		for(int i = 0; i < words.length; i++)
		{  
             
            for(int j = i+1; j < words.length; j++) 
            {  
                if(words[i].equals(words[j])) 
                {  
                    count++;  
                    
                    words[j] = "0";  
                }  
            }  
              
            if(count > 1 && words[i] != "0")  
                System.out.println(words[i]);  
        }  
		
		
		
	}

}
