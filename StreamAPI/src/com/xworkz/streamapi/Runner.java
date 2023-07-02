package com.xworkz.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 

public class Runner {

	public static void main(String[] args) {
		 List<String> listing =new ArrayList<String>();
		 
		 listing.add("Machine Learning");
		 listing.add("Artificial Intelegience");
		 listing.add("Python");
		 listing.add("digital marketing");
		 listing.add("Data science");
		 listing.add("full stack");
		 listing.add("aws");
		 listing.add("Webdevelopment");
		 listing.add("Automation");
		 listing.add("humanresource");
		 listing.add("Business analyst");
		 listing.add("networking");
		 listing.add("CAD");
		 listing.add("panda and .net");
		 listing.add("cyber security");
		 listing.add("Iot");
		 listing.add("information security");
		 listing.add("salesforce");
		 listing.add("Backend development");
		 listing.add("Cisco");
		 
		 listing.forEach((i)->{System.out.println(i);});
	   System.out.println("--------(value which have i)---------"); 
		List<String> CourseList= listing.stream().filter(n-> n.contains("i")).collect(Collectors.toList());
		CourseList.forEach((i)->{System.out.println(i);});
		 System.out.println("--------(values not have space)---------"); 
		 List<String> CourseList1= listing.stream().filter(n-> !n.contains(" ")).collect(Collectors.toList());
	      CourseList1.forEach((j)->{System.out.println(j);});
	 
		 System.out.println("--------(values in lowercase)---------"); 
		 List<String> CourseList2= listing.stream().map(x-> x.toLowerCase()).collect(Collectors.toList());
		 CourseList2.forEach((j)->{System.out.println(j);});
		 System.out.println("-------(values have capital letters)------");
		 
		 List<String> CourseList3= listing.stream().filter(n-> n.startsWith("A")||n.startsWith("B")||n.startsWith("C")||n.startsWith("D")||
				               n.startsWith("W")||n.startsWith("P")||n.startsWith("M")||n.startsWith("I")).collect(Collectors.toList());
		CourseList3.forEach((j)->{System.out.println(j);});
		 
		 System.out.println("-------(sorting)------");	 
		 List<String> sortedList = listing.stream().sorted().collect(Collectors.toList());
		 sortedList.forEach((s) -> {System.out.println(s);});
		 

		    
	}

	 

}
