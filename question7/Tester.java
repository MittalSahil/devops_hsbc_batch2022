package com.question7;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySum obj = new ArraySum();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the dimension of array:");
		int n =scan.nextInt();
		int arr[][] = new int[n][n];
		System.out.println("Enter the array elements:");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j]= scan.nextInt();
			}
		}
		scan.close();
		
		System.out.println("Sum of array elements is: "+obj.sum(arr));
	}

}
