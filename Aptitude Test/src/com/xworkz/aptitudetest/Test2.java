package com.xworkz.aptitudetest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
			boolean c= CheckRoot(19);
			 squre(64);
		
		 
			 List<Integer> list= new ArrayList<Integer>();
			 list.add(19);
			 list.add(34);
			 list.add(45);
			 list.add(14);
			 
			Collections.sort(list, Collections.reverseOrder());
			
			//List<Integer> l= list.stream().sorted().collect(Collectors.toList());
			System.out.println(list);
			System.out.println(list.get(1));
			
			 
	}
	 public  static boolean CheckRoot(int a) {
			 
			  
			 
			int b= (int) Math.sqrt(a);
			if(b>0) {
				System.out.println(b);
				if(b*b==a) {
					System.out.println("perfect square");
					return true;
				}
				System.out.println(" not perfect square");
				return  false;
			}
			
			 
		return false;
			
			    
			  
			  
		 }
		 
		 
		 public static void squre( double num) {
			 
			 double i  ;
			double x= num / 2  ; 
			do {
				i=x;
				x=(i+(num/i))/2;
				System.out.println(x); 
			}
			while((i-x)!=0);
				
			System.out.println(x); 
			 if(i<num) {
				 System.out.println(i); 
			 }
			
			 
		 }
		 

}
