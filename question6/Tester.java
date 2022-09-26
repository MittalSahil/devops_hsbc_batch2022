package com.question6;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStore obj = new ArrayStore();
		System.out.print("Enter new Integer Array :");
		obj.acceptArrayInput();
		System.out.println("--------------------------------------------------");
		System.out.print("Array you have entered: ");
		obj.displayArrayUsingFor();
		int sortedArray[] = obj.sortArray();
		System.out.println("--------------------------------------------------");
		System.out.print("Sorted Array: ");
		for(int i=0; i<10; i++)
		{
			System.out.print(sortedArray[i]+" ");
		}
		System.out.println("");
		
		System.out.println("--------------------------------------------------");
		
		System.out.print("Enter the number for which you want count :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Number "+num+" repeated "+obj.noOfTimes(num)+" times.");
		
		System.out.println("--------------------------------------------------");
		
		System.out.print("Enter the position on which you want to enter the new number:");
		int pos = sc.nextInt();
		System.out.print("Enter the new number:");
		int numb = sc.nextInt();
		sc.close();
		System.out.print("Array before :");
		obj.displayArrayUsingFor();
		
		obj.insertAtPos(numb, pos);
		
		System.out.print("Array After :");
		obj.displayArrayUsingFor();
		
		System.out.println("--------------------------------------------------");
		sortedArray = obj.sortArray();
		System.out.println("Array after removing duplicate elements: ");
		int nonDuplicateArray[] = obj.removeDuplicate(sortedArray);
		for(int i=0; i<nonDuplicateArray.length; i++)
		{
			System.out.print(nonDuplicateArray[i]+" ");
		}
		System.out.println("");
	}

}
