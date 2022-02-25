package example;

public class Maximun {

	public static void main(String[] args) 
	{
	   int [] arr= {12341,2,567,4,5,6,7,0};
	   int max=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]>max)
		   {
		   max=arr[i];
	   }}
	   System.out.println(max);
	}
}
