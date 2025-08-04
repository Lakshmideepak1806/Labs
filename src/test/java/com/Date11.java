package com;

import java.time.LocalDate;
import java.util.Scanner;

public class Date11 {
	
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the date month and year yyyy-mm-dd");
String inputDatestr=sc.next();
LocalDate inputDate=LocalDate.parse(inputDatestr);
System.out.println("Input date:"+inputDate);
LocalDate date=LocalDate.now();
System.out.println("Days ");
System.out.print(date.getDayOfMonth()-inputDate.getDayOfMonth());
System.out.println("Months ");
System.out.print(date.getMonthValue()-inputDate.getMonthValue());
System.out.println("Days ");
System.out.print(date.getYear()-inputDate.getYear());
}
}
