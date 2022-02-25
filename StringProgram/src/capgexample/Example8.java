package capgexample;



public class Example8 {

	public static void main(String[] args) 
	{
		String str = "Indian is my Country";  
        System.out.println(charRemoveAt(str, 7));  
     }  
     public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
		

	}

}
