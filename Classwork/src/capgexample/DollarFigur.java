package capgexample;

public class DollarFigur {

	public static void main(String[] args) 
	{
		 for(int rows=0;rows<7;rows++)
		 {
			 for(int star=0;star<rows*2;star++)
			 {
				 System.out.print("*");
			 }
			 for(int money=7;money>rows;money--)
			 {
				 System.out.print("$");
			 }
			 for(int midstar=14;midstar>rows*2;midstar--)
			 {
				 System.out.print("*");
			 }
			 for(int money=7;money>rows;money--)
			 {
				 System.out.print("$");
			 }
			 for(int star=0;star<rows*2;star++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		

	}

}
