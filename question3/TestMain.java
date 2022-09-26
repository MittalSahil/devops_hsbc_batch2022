package com.question3;
import java.util.Scanner;
public class TestMain {

	static void tableUsingForLoop(int num)
	{
		System.out.println("Table of "+num+" using for loop:");
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		System.out.println("--------------------------------------------");
	}
	
	static void tableUsingWhileLoop(int num)
	{
		System.out.println("Table of "+num+" using while loop:");
		int i=1;
		while(i<=10)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
			i++;
		}
		System.out.println("--------------------------------------------");
		
	}
	
	static void tableUsingDoWhileLoop(int num)
	{
		System.out.println("Table of "+num+" using do-while loop:");
		int i=1;
		do {
			System.out.println(num+" * "+i+" = "+(num*i));
			i++;
		}while(i<=10);
		System.out.println("--------------------------------------------");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		scan.close();
		tableUsingForLoop(num);
		tableUsingWhileLoop(num);
		tableUsingDoWhileLoop(num);
		
	}

}
