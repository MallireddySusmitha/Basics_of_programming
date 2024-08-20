package javaprogram;

import java.util.Scanner;

public class AewaOfTrapezium {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a=sc.nextDouble();
		System.out.println("Enter the value of b");
		double b=sc.nextDouble();
		System.out.println("Enter the value of h");
		double h=sc.nextDouble();
		double area= 1/2*(a+b)*h;
		System.out.println(area);
		

	}

}
