package com.xworkz.aptitudetest;

public class Test1 {
	public static void main(String[] args) {
		String a = "Hello World";
		String reversed = reverse(a);
		System.out.println( reversed);

	}

	public static String reverse(String a) {

		String[] ar = a.split(" ", 2);

		for (String r : ar)
			System.out.println(r);

		StringBuilder reversedString = new StringBuilder();

		for (int i = ar.length - 1; i >= 0; i--) {
			reversedString.append(ar[i]);
			if (i > 0) {
				reversedString.append(" ");  
			}
		}

		return reversedString.toString();
	}

}
