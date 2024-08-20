package javaprogram;

import java.util.Scanner;

public class CircumferenceOfCirce {
	final static double pi=Math.PI;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of r");
		double r=sc.nextDouble();
		double circ=2*pi*r;
		System.out.println(circ);
	}
	

}
