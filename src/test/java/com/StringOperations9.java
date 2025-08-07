package com;


import java.util.Scanner;

public class StringOperations9 {
	String str="Deepak";
	
	void add() {
		System.out.println("To add string to itself");
		String str1=str+str;
		System.out.println("The Added String is "+str1);			
		}
	void replace() {
			StringBuilder replaced = new StringBuilder(str);
			for(int i=0;i<=replaced.length()-1;i++) {
				if(i%2!=0) {
					replaced.setCharAt(i, '#');
					
				}
		}
			System.out.println(replaced);
			
		}
	void removeDuplicates() {
			 StringBuilder dup= new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (dup.indexOf(str.valueOf(c))==-1) {
                    dup.append(c);
                }
		}
			System.out.println(dup);
		}
	void uppercase() {
			StringBuilder modified = new StringBuilder(str);
		for (int i = 0; i < modified.length(); i++) {
            if (i % 2 != 0) {
            	 modified.setCharAt(i, Character.toUpperCase(modified.charAt(i)));
            } 
        }
		System.out.println(modified);
		}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("choose the operations:");
	System.out.println("1.Add string to itself");
	System.out.println("2.replace odd with #");
	System.out.println("3.Remove duplicates");
	System.out.println("4.Change to uppercase");
	
	int choice=s.nextInt();
	StringOperations9 op=new StringOperations9();

	switch (choice) {
	case 1:
		op.add();
		break;
	case 2:
		op.replace();
		break;
	case 3:
		op.removeDuplicates();
		break;
	case 4:
		op.uppercase();
		break;
	default:
		System.out.println("invalid number");
		break;
	}
}
	
}

