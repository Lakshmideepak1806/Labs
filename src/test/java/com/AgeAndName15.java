package com;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeAndName15 {
	String FullName(String FirstName,String LastName) {
		
		return FirstName+" "+LastName;
	}
	int Age(String Dobstr) {
		
		LocalDate dob=LocalDate.parse(Dobstr);
		LocalDate current=LocalDate.now();
		return current.getYear()-dob.getYear();
	}
public static void main(String[] args) {
	AgeAndName15 an=new AgeAndName15();
	String Fullname=an.FullName("N", "LakshmiDeepak");
	int Age=an.Age("2002-08-01");
	System.out.println("Person Details");
	System.out.println("Full Name:" + Fullname);
	System.out.println("Age: "+Age);
	
	
}
}
