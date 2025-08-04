package com;

import java.time.LocalDate;

import java.util.Scanner;

public class Warranteedate13 {
void purchase() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Purchase of the product date in format yyyy-mm-dd");
	String inputStr=sc.next();
	LocalDate input=LocalDate.parse(inputStr);
	System.out.println(input);
	System.out.println("product has warranty:");
	int years=sc.nextInt();
	System.out.println("years");
	 LocalDate warrantyEndDate = input.plusYears(years);
	System.out.println("The end date of warranty is:-"+warrantyEndDate);
}
public static void main(String[] args) {
	Warranteedate13 wd=new Warranteedate13();
	wd.purchase();
}

}
