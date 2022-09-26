package com.question5;


import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String text = scan.next();
		
		System.out.println("");
		System.out.print("Enter the position on which you want to find character at: ");
		int pos = scan.nextInt();
		charAtText(text, pos);
		
		System.out.print("Enter the text which you want to find in a string: ");
		String str = scan.next();
		containsText(text, str);
		
		lengthOfString(text);
		
		System.out.print("Enter the substring to find position : ");
		str = scan.next();
		indexOfString(text, str);
		
		System.out.print("Enter the new string to compare: ");
		str= scan.next();
		equalsString(text, str);
		
		System.out.print("Enter the new string to compare without case: ");
		str = scan.next();
		equalsIgnoreCaseString(text, str);
			
		System.out.print("Enter your birth day (DD) :");
		int day = scan.nextInt();
		System.out.print("Enter your birth month (MM) :");
		int month = scan.nextInt();
		System.out.print("Enter your birth year (YYYY) :");
		int year = scan.nextInt();
		joinString(day, month, year);
		
		System.out.print("Enter the substring to find first position from last: ");
		str = scan.next();
		lastIndexOfString(text, str);
		
		System.out.print("Enter the start position to find substring :");
		int stPos = scan.nextInt();
		System.out.print("Enter the ending position to find substring :");
		int endPos = scan.nextInt();
		substringString(text, stPos, endPos);
		
		toLowerCaseString(text);
		toUpperCaseString(text);
		
		System.out.print("Enter the string having spaces in front or end :");
		text = scan.next();
		trimString(text);
		scan.close();
	}
	public static void charAtText(String text, int pos) {
		System.out.println("Character at position "+pos+" is "+text.charAt(pos));
	}
	public static void containsText(String text, String str) {
		System.out.println("Does it contains? "+text.contains(str));
	}
	public static void lengthOfString(String text) {
		System.out.println("Length of the string "+text+" is "+text.length());
	}
	public static void indexOfString(String text, String str) {
		System.out.println("Index of string "+str+" is "+text.indexOf(str));
	}
	public static void equalsString(String text, String str) {
		if (text.equals(str)) {  
            System.out.println("both strings are equal");  
        }else System.out.println("both strings are unequal");  
	}
	public static void equalsIgnoreCaseString(String text, String str) {
		if (text.equalsIgnoreCase(str)) {  
            System.out.println("both strings are equal");  
        }else System.out.println("both strings are unequal");
	}
	public static void joinString(int day, int month, int year) {
		
		System.out.println("Your birth date is :"+ String.join("/", Integer.toString(day), Integer.toString(month), Integer.toString(year)));
	}
	public static void lastIndexOfString(String text, String str) {
		System.out.println("Last Index of string "+str+" is "+text.lastIndexOf(str));
	}
	public static void substringString(String text, int stPos, int endPos) {
		System.out.println("Substring starting from index 0 to 6: "+text.substring(stPos,endPos));
	}
	public static void toLowerCaseString(String text) {
		System.out.println("After converting to lower case string is:"+text.toLowerCase());
	}
	public static void toUpperCaseString(String text) {
		System.out.println("After converting to upper case string is:"+text.toUpperCase());
	}
	public static void trimString(String text) {
		System.out.println("After trim string becomes :"+text.trim());
	}

}