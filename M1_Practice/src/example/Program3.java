package example;

public class Program3 {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,2,34,4,6,8};
		int l=arr.length;
		int n=arr.length/2;
		int temp;
		for(int i=0;i<n;i++)
		{
			temp=arr[i];
			arr[i]=arr[l-i-1];
			arr[l-i-1]=temp;
		}
		for(int element:arr)
		{
		   System.out.print(" " +element);	
		}
		System.out.println("");
		

	}

}
