package capgexample;

public class Example13 {

		 static public String move(String s)
		    {
		        
		        return s.replaceAll("[A-Z]+", "") + s.replaceAll("[^A-Z]+", "");
		    }
		 
		    public static void main(String args[])
		    {
		        String str = "iam Sunil T M";
		 
		        System.out.println("Befour Operation:   " + str);
		        System.out.println("After Operation:    " + move(str));
		   

	}

}
