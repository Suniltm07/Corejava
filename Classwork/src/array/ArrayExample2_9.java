package com.capg.array;

public class ArrayExample2_9 
{
	public static void main(String[] args){
	    int a[] = { 2, 3, 1, 45, 15};
	    int t;
	    for(int i = 0;i<a.length-1;i++){
	      for(int j = i+1;j<a.length;j++){
	        if(a[i]>a[j]){
	          t = a[i];
	          a[i] = a[j];
	          a[j] = t;
	        }
	      }
	    }
	    for(int i = 0;i<a.length;i++){
	      System.out.println(a[i]);
	    }
	  }
	}


