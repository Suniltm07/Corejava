package example;

public class Program2 {

	public static void main(String[] args) 
	{
		int B[]= {1,2,3,4,5};
		int sum=2;
		boolean Array =false;
		for(int element:B)
		{
			if(sum==element)
			{
				Array=true;
		    }
		}
		if(Array)
		{
			System.out.println("is their");
		}
		else
		{
			System.out.println("is not their");
		}

	}

}
