package com.capg.array;

public class ArrayExample2_7
{
	public static void main(String[] args){
	    int[] a = {4,8,6,3,2};
	    int[] b = new int[a.length+1];
	    int highest = a[0];
	    int second_highest = a[0];
	    int j = 0;
	    for(int i=0;i<a.length;i++){
	      if(a[i]>highest){
	        highest = a[i];
	        j = i;
	      }
	    }
	    for(int i = 0;i<a.length;i++){
	      if(a[i]<highest && a[i]>second_highest){
	        second_highest = a[i];
	      }
	    }

	    for(int i = 0;i<j;i++){
	      b[i] = a[i];
	    }
	    b[j] = second_highest;
	    b[j+1] = highest-second_highest;
	    for(int i = j+2;i<b.length;i++){
	      b[i] = a[i-1];
	    }
	    for(int i = 0;i<b.length;i++){
	      System.out.println(b[i]);
	    }
	  }
	

}
