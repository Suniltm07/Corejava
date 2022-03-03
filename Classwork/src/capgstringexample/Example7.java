package capgstringexample;

public class Example7 {

	public static void main(String[] args)
	{
		String str ="SunilSuni";

        for(char i :str.toCharArray())
        {
        if ( str.indexOf(i) == str.lastIndexOf(i)) 
        {
            System.out.println("First non-repeating character is: "+i);
            break;

        }
        }

}}
