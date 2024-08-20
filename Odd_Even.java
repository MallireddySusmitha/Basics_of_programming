package javaprogram;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=s1.nextInt();
		if(n%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		s1.close();
		
	}

}
