package com.xworkz.basic;

import java.util.Arrays;

public class ArrayMax {

	public static void main(String[] args) {
 int[] a= {23,45,12,15,28,49,53,10};
 
 Arrays.sort(a);
 for(int i=0;i<a.length;i++) {
	 System.out.println(a[i]);
}
 
		 
		 int ar=MaxArray(a);
		 System.out.println(ar);
		 int ar2=MinArray(a);
		 System.out.println(ar2);
	}
	
	 public static  int  MaxArray(int[] arr) {
		 int len=arr.length;
		 int max=0;
		  
		 
		 for(int i=0;i<len;i++) {
			  max=max+arr[i];
		 }
		return max;
		 

	}
	 
	 public static  int  MinArray(int[] arr) {
		 int len=arr.length;
		 
		 int min=arr[0];
		 
		 for(int i=0;i<len;i++) {
			 if(min>arr[i]) {
				 min=arr[i];
			 }
		 }
		return min;
		 

	}
	 

}
