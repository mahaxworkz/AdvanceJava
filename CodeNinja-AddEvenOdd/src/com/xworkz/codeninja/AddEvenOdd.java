package com.xworkz.codeninja;

import java.util.ArrayList;
import java.util.Scanner;

public class AddEvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String n= scan.nextLine();
		 	int a=	 evenAdd(n);
	System.out.println(a);
		int b=	 oddAdd(n);
	System.out.println(b);

	}
	public static int evenAdd(String n){
		int count=0;
		 
		for(int i=0;i<n.length();i++){
     int val=  Character.getNumericValue(n.charAt(i));
	  if(val%2== 0){
		  count+=val;
	  }

		}
		 
		
    
	 return count;
	}
	public static int oddAdd(String n){
		int count=0;
		 
		for(int i=0;i<n.length();i++){
     int val=  Character.getNumericValue(n.charAt(i));
	  if(val%2!= 0){
		  count+=val;
	  }

		}
		 
		
    
	 return count;
	}
}
