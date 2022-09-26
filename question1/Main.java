import java.util.Scanner;

public class Main {
	
	public static void add(short a, short b)
	{
		System.out.println("Method add(short, short) is called");
		System.out.print("Addition of "+a+" + "+b+" is : ");
		System.out.println(a+b);
		System.out.println("");
	}
	
	public static void add(long a, long b)
	{
		System.out.println("Method add(long, long) is called");
		System.out.print("Addition of "+a+" + "+b+" is : ");
		System.out.println(a+b);
		System.out.println("");
	}
	
	public static void add(float a, float b)
	{
		System.out.println("Method add(float, float) is called");
		System.out.print("Addition of "+a+" + "+b+" is : ");
		System.out.println(a+b);
		System.out.println("");
	}
	
	public static void add(double a, double b)
	{
		System.out.println("Method add(double, double) is called");
		System.out.print("Addition of "+a+" + "+b+" is : ");
		System.out.println(a+b);
		System.out.println("");
	}
	
	public static void add(long a, long b, long c)
	{
		System.out.println("Method add(long, long, long) is called");
		System.out.print("Addition of "+a+" + "+b+" + "+c +" is : ");
		System.out.println(a+b+c);
		System.out.println("");
	}
	
	public static void add(String a, int b)
	{
		System.out.println("Method add(String, int) is called");
		System.out.println("Addition of "+a+" + "+b+" is : "+ a+" "+b);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10, 20);
		add((short)10, (short)20);
		add(10, 30, 20);
		add((float)10.5, (float)20.8);
		add(30.64, 12.33);
		add("Sahil", 10);
	}

}
