package com.question6;
import java.util.Scanner;

public class ArrayStore {

	private int numArray[] = new int[10];
	void acceptArrayInput()
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			numArray[i] = scan.nextInt();
		}
	}
	
	void displayArrayUsingFor()
	{
		for(int i=0; i<10; i++)
		{
			System.out.print(numArray[i]+" ");
		}
		System.out.println("");
	}
	
	void displayArrayUsingWhile()
	{
		int i=0;
		while(i<10)
		{
			System.out.print(numArray[i]+" ");
			i++;
		}
		System.out.println("");
	}
	
	int[] sortArray()
	{
		int arr[] = new int[10]; 
		for(int i=0; i<10; i++)
		{
			arr[i] = numArray[i];
		}
		int temp=0;
		for(int i=0; i < 10; i++){  
			for(int j=1; j < (10-i); j++){  
				if(arr[j-1] > arr[j]){  
					//swap elements  
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;  
				}
			} 
		}
		return arr;
	}
	
	int noOfTimes(int num)
	{
		int count=0;
		for(int i=0; i<10; i++)
		{
			if(numArray[i]==num)
			{
				count++;
			}
		}
		return count;
	}
	
	void insertAtPos(int num, int pos)
	{
		numArray[pos-1]=num;
	}
	
	int[] removeDuplicate(int sortedArray[])
	{ 
        int j = 0;
 
        
        for (int i = 0; i < 10 - 1; i++) {
            if (sortedArray[i] != sortedArray[i + 1]) {
                sortedArray[j++] = sortedArray[i];
            }
        }
 
        sortedArray[j++] = sortedArray[9];
        int arr[] = new int[j];
        for(int i=0; i<j; i++)
        {
        	arr[i] = sortedArray[i];
        }
		return arr;
	}
}
