package com.xworkz.basic;

public class Palindrom {

	public static void main(String[] args) {
//		String a="A man, a plan, a canal: Panama";
//		int[ ] ar= {1,2,4,7,6};
//		
//		int o=ar.length;
//	boolean b=	isPalindrome(a);
//		System.out.println(b);
		// int a=strStr("hello",  "ll");
		// System.out.println(a);
		 
		 String s="hello";
		 String s2="ll";
		 boolean ans= s.contains(s2);
		 System.out.println(ans);
		
	}
	 public static boolean isPalindrome(String s) {

	      //  String crtStr=s.replaceAll("\\s","");
	         String check=s.replaceAll( "\\p{Punct}|\\s", "").toLowerCase();
	        // s=s.replaceAll("\\p{Punct}|\\s","");
	        //String check= crt.toLowerCase();
	        StringBuilder rev= new StringBuilder(check) ;
	        String rev1= rev.reverse().toString();
	        System.out.println(check);
	        System.out.println(rev1);
	        if(check.equals(rev1)){
	        	System.out.println("palindrome");
	            return true;
	        }
	        System.out.println(" not palindrome");
	        return false;
	    } 
	 public static int strStr(String haystack, String needle) {

	      int N = haystack.length();
	        int M = needle.length();
	 
	         
	        for (int i = 0; i <= N - M; i++) {
	        int j;
	 
	            
	            for (j = 0; j < M; j++)
	                if (haystack.charAt(i + j) != needle.charAt(j))
	                	
	                    break;
	 
	            if (j == M)
	            	System.out.println("true");
	                return 0;
	        }  
	        System.out.println("true not");
	        return -1;
	    }
}
