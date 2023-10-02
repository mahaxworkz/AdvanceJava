package com.xworkz.basic;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
//	int	num=12;
//		if((num&1)==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
		
//	boolean value=	check("nane","mane");
//		if(value) {
//			System.out.println("anagram");
//		}
//		else {
//			System.out.println("not");
//		}
		double base = 5;
	    // Works only when exponent is positive integer
	    int expo = 2;
	    double res = 1.0;
	    
	    while (expo != 0) {
	        res *= base;
	        expo--;
	    }
	    
	    System.out.println("Result = " + res); 
		
	}
	public static  boolean check(String s1,String s2){
		String st1=s1.toLowerCase();
		String st2=s2.toLowerCase();
		
		if(st1.length()==st2.length()) {
		char[] res1=	st1.toCharArray();
		char[] res2=	st2.toCharArray();
		
		Arrays.sort(res1);
		Arrays.sort(res2);
		
		boolean result= Arrays.equals(res1, res2);
		
		return result;
		}
		 
		return false;
		
	}
	
	

}
