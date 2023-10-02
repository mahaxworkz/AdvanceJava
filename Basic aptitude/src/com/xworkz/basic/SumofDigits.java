package com.xworkz.basic;

public class SumofDigits {

	public static void main(String[] args) {
		// sum of digits
		/*int num=12367;
		 int sum =0;
		 
		 while(num!=0) {
			 sum= sum+num%10;
			 num=num/10;
			 
		 }
			System.out.println(sum);	
		 

	}*/
		
		String st = "prepinsta";
		 
		 String	s1=st.replaceAll("[aeiou]", "");
		System.out.println(s1);
	
	// no of vowels
	String s = "prepinsta";
	//char[] c = s.toCharArray();
	int vowel=0;
	
	for (int i = 0; i < s.length(); i++) { 
        if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
            vowel++; 
	}

System.out.println("Vowels: " + vowel);
}
	
	   

}
