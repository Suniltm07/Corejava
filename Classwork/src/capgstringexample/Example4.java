package capgstringexample;

import java.util.Arrays;

public class Example4 {

	public static void main(String[] args)
	{
		 String s = "hallosunni";
	        String s1 = "halalala";
	        char[] ss = s.toCharArray();
	        char[] ss1 = s1.toCharArray();

	        for(int i=0;i<ss.length;i++){
	          for(int j=0;j<ss1.length;j++){
	                if(ss1[j] == ss[i]){
	                    ss[i] = 'a'; 
	                }
	            }
	         }
	        System.out.println(Arrays.toString(ss));

	}

}
