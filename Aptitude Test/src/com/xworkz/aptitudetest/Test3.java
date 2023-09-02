package com.xworkz.aptitudetest;

public class Test3 {
	public static void main(String[] args) {
		int[] ar= {12,24,35,67,89,22};
		int max=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>max) {
				 max=ar[i];
			}
			
		}
		System.out.println("max  " +max);
	} 

}
