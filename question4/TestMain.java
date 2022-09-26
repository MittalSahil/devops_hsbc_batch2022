package com.question4;
import java.util.Scanner;
public class TestMain {

	int countwords(String str)
	{
		int count=0;
		int i=0;
		while(i<str.length())
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
			i++;
		}
		count++;
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(str);
		TestMain obj = new TestMain();
		int numOfWords = obj.countwords(str);
		System.out.println("Number of words in String are : "+numOfWords);
	}

}
